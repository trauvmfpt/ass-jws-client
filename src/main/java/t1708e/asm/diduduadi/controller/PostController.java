package t1708e.asm.diduduadi.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import t1708e.asm.diduduadi.dto.PlaceDTO;
import t1708e.asm.diduduadi.dto.PostDTO;
import t1708e.asm.diduduadi.dto.RatingDTO;
import t1708e.asm.diduduadi.dto.UserDTO;
import t1708e.asm.diduduadi.entity.*;
import t1708e.asm.diduduadi.service.place.PlaceService;
import t1708e.asm.diduduadi.service.post.PostService;
import t1708e.asm.diduduadi.service.user.UserService;
import t1708e.asm.diduduadi.util.CloudinaryUtil;

import java.rmi.RemoteException;
import java.util.*;

@Controller
@RequestMapping(value = "/posts")
public class PostController {
    @Autowired
    PlaceService placeService;
    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model) throws RemoteException {
        String o = placeService.getListPlace();
        PlaceDTO[] placeArr = new Gson().fromJson(o,PlaceDTO[].class);
        List<PlaceDTO> placeList = new ArrayList<>();
        if (placeArr != null) {
            placeList = Arrays.asList(placeArr);
        }
        model.addAttribute("places", placeList);
        return "post/form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store(Model model, @RequestParam("file") MultipartFile[] multipartFiles,
                        @RequestParam("information") String information, @RequestParam("title") String title, @RequestParam("description") String description,
                        @RequestParam("placeId") int placeId) throws RemoteException {

        PlaceDTO place =new Gson().fromJson(placeService.detailPlace(placeId),PlaceDTO.class);
        Place placePost = new Place();
        placePost.setId(place.getId());
        placePost.setName(place.getName());
        placePost.setAddress(place.getAddress());
        Post post = new Post();
        post.setInfo(information);
        post.setPlace(placePost);
        post.setTitle(title);
        post.setDescription(description);

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        UserDTO userDTO = new Gson().fromJson(userService.getByUserName(name), UserDTO.class);
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setAddress(userDTO.getAddress());
        user.setAge(userDTO.getAge());
        user.setEmail(userDTO.getEmail());
        user.setAge(userDTO.getAge());
        user.setStatus(userDTO.getStatus());

        post.setUser(user);
        if (multipartFiles != null){
            List<String> images = CloudinaryUtil.saveImage(multipartFiles);
            Set<Image> imageList = new HashSet<>();
            for (String imageStr: images
                 ) {
                Image image = new Image();
                image.setSource(imageStr);
                image.setStatus(1);
                imageList.add(image);
            }

            post.setImageSet(imageList);
        }
        postService.createPost(new Gson().toJson(post));
        return "redirect:/place/" + placeId;
    }
    @RequestMapping(method = RequestMethod.GET,  value = "/{id}")
    public String detail(@PathVariable int id, Model model) throws RemoteException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        PostDTO postDTO = new Gson().fromJson(postService.getByIdPost(id),PostDTO.class);
        String like = "";
        boolean likeStatus = true;
        if(postDTO.getRatings() != null){
            if(postDTO.getRatings().size() == 1 ){
               if(postDTO.getRatings().get(0).getUserName().equals(name)){
                   like = "You have liked this post";
                   likeStatus = false;
               }
               else{
                   like = "1 other liked this post";
                   likeStatus = true;
               }
            }
            else{
                for (RatingDTO r: postDTO.getRatings()
                ) {
                    if(r.getUserName().equals(name)){
                        like = "You and " + (postDTO.getRatings().size() - 1) + " others have liked this post";
                        likeStatus = false;
                        break;
                    }
                    else{
                        like = postDTO.getRatings().size() + " others have liked this post";
                        likeStatus = true;
                    }
                }
            }
        }
        else{
            like = "Be first to like this post";
            likeStatus = true;
        }
        model.addAttribute("currentPost",postDTO);
        model.addAttribute("like", like);
        model.addAttribute("likeStatus", likeStatus);
        model.addAttribute("post", postDTO);
        return "post/detail";
    }
}
