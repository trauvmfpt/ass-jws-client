package t1708e.asm.diduduadi.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import t1708e.asm.diduduadi.dto.PlaceDTO;
import t1708e.asm.diduduadi.entity.*;
import t1708e.asm.diduduadi.service.place.PlaceService;
import t1708e.asm.diduduadi.service.post.PostService;
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
//    @ResponseBody
    public String store(Model model, @RequestParam("file") MultipartFile[] multipartFiles,
                        @RequestParam("information") String information,
                        @RequestParam("placeId") int placeId) throws RemoteException {
        //get Place
//        String a = placeService.detailPlace(placeId);
        PlaceDTO place =new Gson().fromJson(placeService.detailPlace(placeId),PlaceDTO.class);
        Place placePost = new Place();
        placePost.setId(place.getId());
        placePost.setName(place.getName());
        placePost.setAddress(place.getAddress());
        //
        Post post = new Post();
        post.setInfo(information);
        post.setPlace(placePost);
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
        return "redirect:/";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public String detail(){
        return "post/detail";
    }
}
