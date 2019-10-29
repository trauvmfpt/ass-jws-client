package t1708e.asm.diduduadi.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import t1708e.asm.diduduadi.dto.CommentDTO;
import t1708e.asm.diduduadi.dto.ImageDTO;
import t1708e.asm.diduduadi.dto.RatingDTO;
import t1708e.asm.diduduadi.entity.*;
import t1708e.asm.diduduadi.entity.rest.RESTResponse;
import t1708e.asm.diduduadi.service.image.ImageService;
import t1708e.asm.diduduadi.service.post.PostService;
import t1708e.asm.diduduadi.service.rate.RatingService;
import t1708e.asm.diduduadi.service.user.UserService;

import javax.servlet.http.HttpServletRequest;
import java.rmi.RemoteException;

@RestController
@RequestMapping(value = "/rating")
public class RatingController {
    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @Autowired
    ImageService imageService;

    @Autowired
    RatingService ratingService;

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody RatingDTO ratingDTO) throws RemoteException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = new Gson().fromJson(userService.getByUserName(auth.getName()), User.class);

        if(ratingDTO.isStatus()){
            Rating rating = new Rating();
            rating.setStar(1);
            rating.setUser(user);

            if(ratingDTO.getPostId() != 0){
                Post post = new Gson().fromJson(postService.getByIdPost(ratingDTO.getPostId() ), Post.class);
                rating.setPost(post);
            }

            if(ratingDTO.getImageId() != 0){
                Image image  = new Gson().fromJson(imageService.getByIdImage(ratingDTO.getImageId()), Image.class);
                rating.setImage(image);
            }
            ratingService.createRate(new Gson().toJson(rating, Rating.class));
        }
        else{
            RatingDTO rating = new RatingDTO();
            if(ratingDTO.getPostId() != 0){
                 rating = new Gson().fromJson(ratingService.getByUserIdAndPostId(user.getId(), ratingDTO.getPostId()), RatingDTO.class);
            }
            if(ratingDTO.getImageId() != 0){
                rating = new Gson().fromJson(ratingService.getByUserIdAndImageId(user.getId(), ratingDTO.getImageId()), RatingDTO.class);
            }
            ratingService.deleteRate(new Gson().toJson(rating));
        }
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Action success!")
                .build(),
                HttpStatus.OK);
    }
}
