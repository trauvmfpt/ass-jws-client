package t1708e.asm.diduduadi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.asm.diduduadi.entity.*;
import t1708e.asm.diduduadi.service.user.UserService;

import java.rmi.RemoteException;
import java.util.Arrays;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String login() throws RemoteException {
        return "authen/login";
    }
}
