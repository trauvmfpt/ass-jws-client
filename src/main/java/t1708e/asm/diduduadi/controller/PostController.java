package t1708e.asm.diduduadi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import t1708e.asm.diduduadi.service.place.PlaceService;
import t1708e.asm.diduduadi.service.post.Image;
import t1708e.asm.diduduadi.service.post.Post;
import t1708e.asm.diduduadi.service.post.PostService;
import t1708e.asm.diduduadi.util.CloudinaryUtil;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/posts")
public class PostController {
    @Autowired
    PlaceService placeService;
    @Autowired
    PostService postService;

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model) throws RemoteException {
        Place[] placeArr = placeService.getListPlace();
        List<Place> placeList = new ArrayList<>();
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
        Place place = placeService.detailPlace(placeId);
        t1708e.asm.diduduadi.service.post.Place placePost = new t1708e.asm.diduduadi.service.post.Place();
        placePost.setId(place.getId());
        placePost.setName(place.getName());
        placePost.setAddress(place.getAddress());
        //
        Post post = new Post();
        post.setInfo(information);
        post.setPlace(placePost);
        if (multipartFiles != null){
            List<String> images = CloudinaryUtil.saveImage(multipartFiles);
            List<Image> imageList = new ArrayList<>();
            for (String imageStr: images
                 ) {
                Image image = new Image();
                image.setSource(imageStr);
                image.setStatus(1);
                imageList.add(image);
            }

            post.setImageSet(imageList.toArray(new Image[0]));
        }
        postService.createPost(post);
        return "redirect:/";
    }
}
