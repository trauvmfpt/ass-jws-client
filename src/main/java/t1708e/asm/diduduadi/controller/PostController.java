package t1708e.asm.diduduadi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/posts")
public class PostController {
    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(){ return "post/form"; }
}
