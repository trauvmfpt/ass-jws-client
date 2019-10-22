package t1708e.asm.diduduadi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET, value = "")
    public String register(){
        return "authen/register";
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/create")
//    public String create(@Valid User user, BindingResult bindingResult){
//        return "Success";
//    }
}
