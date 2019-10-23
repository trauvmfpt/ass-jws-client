package t1708e.asm.diduduadi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t1708e.asm.diduduadi.service.search.SearchService;
import t1708e.asm.diduduadi.service.search.SearchServiceServiceLocator;
import t1708e.asm.diduduadi.service.user.UserService;
import t1708e.asm.diduduadi.service.user.UserServiceServiceLocator;


import javax.xml.rpc.ServiceException;

@Configuration
public class ServiceConfig {

    @Bean
    UserService userService() throws ServiceException {
        UserServiceServiceLocator locator = new UserServiceServiceLocator();
        UserService userService = locator.getUserServicePort();
        return userService;
    }

    @Bean
    SearchService searchService() throws ServiceException {
        SearchServiceServiceLocator locator = new SearchServiceServiceLocator();
        SearchService searchService = locator.getSearchServicePort();
        return searchService;
    }
}
