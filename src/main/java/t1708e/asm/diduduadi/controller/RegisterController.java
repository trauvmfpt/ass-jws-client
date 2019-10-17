package t1708e.asm.diduduadi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/login")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public String register(){
        return "register/register";
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/create")
//    public String create(@Valid User user, BindingResult bindingResult){
//        return "Success";
//    }
}
