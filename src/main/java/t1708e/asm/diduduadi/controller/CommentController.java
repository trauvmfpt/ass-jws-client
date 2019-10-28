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
import t1708e.asm.diduduadi.dto.UserDTO;
import t1708e.asm.diduduadi.entity.Comment;
import t1708e.asm.diduduadi.entity.Image;
import t1708e.asm.diduduadi.entity.Post;
import t1708e.asm.diduduadi.entity.User;
import t1708e.asm.diduduadi.entity.rest.RESTResponse;
import t1708e.asm.diduduadi.service.comment.CommentService;
import t1708e.asm.diduduadi.service.image.ImageService;
import t1708e.asm.diduduadi.service.post.PostService;
import t1708e.asm.diduduadi.service.user.UserService;

import javax.servlet.http.HttpServletRequest;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @Autowired
    ImageService imageService;

    @PostMapping(value = "/create")
    public String save(CommentDTO commentDTO, HttpServletRequest request) throws RemoteException {
        Comment comment = new Comment();
        comment.setContent(commentDTO.getContent());

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        User user = new Gson().fromJson(userService.getByUserName(auth.getName()), User.class);
        comment.setUser(user);

        if(commentDTO.getPostId() != 0){
            Post post = new Gson().fromJson(postService.getByIdPost(commentDTO.getPostId()), Post.class);
            comment.setPost(post);
        }

        if(commentDTO.getImageId() != 0){
            Image image  = new Gson().fromJson(imageService.getByIdImage(commentDTO.getImageId()), Image.class);
            comment.setImage(image);
        }

        commentService.createComment(new Gson().toJson(comment));
        String referer = request.getHeader("Referer");
        return "redirect:"+ referer;
    }
}
