package t1708e.asm.diduduadi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import t1708e.asm.diduduadi.entity.Role;
import t1708e.asm.diduduadi.service.user.UserService;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        t1708e.asm.diduduadi.service.user.UserDTO user = null;
        try {
            user = (t1708e.asm.diduduadi.service.user.UserDTO) userService.getByUserName(s);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        UserDetails userDetails =
                User.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .roles("guide")
                        .build();
        return userDetails;
    }
}