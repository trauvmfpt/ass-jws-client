package t1708e.asm.diduduadi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.asm.diduduadi.entity.User;
import t1708e.asm.diduduadi.service.user.UserService;

import javax.validation.Valid;
import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("user", new User());
        return "authen/register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String store(Model model, @Valid User user, BindingResult bindingResult , Integer[] roleIds) throws RemoteException {
        if (bindingResult.hasErrors()) {
            model.addAttribute("user", user);
            return "student/form";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.createUser(user, roleIds);
        return "redirect:/login";
    }
}
