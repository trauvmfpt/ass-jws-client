package t1708e.asm.diduduadi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.asm.diduduadi.service.user.User;
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
        //        List<User> users = Arrays.asList();
        User user = new User();
        Integer[] a = {1};
        user.setAddress("Ha Noi");
        user.setAge(18);
        user.setEmail("user1@user.com");
        user.setGender(1);
        user.setUsername("userdemo1");
        user.setPassword("123456");
        user.setName("new user");
//        userService.createUser(user,a);
        return "authen/login";
    }
}
