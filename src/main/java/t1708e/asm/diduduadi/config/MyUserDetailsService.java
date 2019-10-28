package t1708e.asm.diduduadi.config;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import t1708e.asm.diduduadi.dto.UserDTO;
import t1708e.asm.diduduadi.service.user.UserService;

import java.rmi.RemoteException;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDTO user = null;
        String[] rolesArray = new String[0];
        try {
            user = new Gson().fromJson(userService.getByUserName(s), UserDTO.class);
            rolesArray = new String[user.getRole().size()];
            rolesArray = user.getRole().toArray(rolesArray);
        } catch (RemoteException e) {
            e.printStackTrace();
            user = new UserDTO();
            user.setUsername("null");
            user.setPassword("null");
        }

        UserDetails userDetails =
                User.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .roles(rolesArray)
                        .build();
        return userDetails;
    }
}