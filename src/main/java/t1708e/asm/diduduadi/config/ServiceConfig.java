package t1708e.asm.diduduadi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t1708e.asm.diduduadi.service.place.PlaceService;
import t1708e.asm.diduduadi.service.place.PlaceServiceServiceLocator;
import t1708e.asm.diduduadi.service.post.PostService;
import t1708e.asm.diduduadi.service.post.PostServiceServiceLocator;
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
    PlaceService placeService() throws ServiceException {
        PlaceServiceServiceLocator locator = new PlaceServiceServiceLocator();
        PlaceService placeService = locator.getPlaceServicePort();
        return placeService;
    }

    @Bean
    SearchService searchService() throws ServiceException {
        SearchServiceServiceLocator locator = new SearchServiceServiceLocator();
        SearchService searchService = locator.getSearchServicePort();
        return searchService;
    }
    @Bean
    PostService postService() throws ServiceException {
        PostServiceServiceLocator locator = new PostServiceServiceLocator();
        PostService postService = locator.getPostServicePort();
        return postService;
    }
}
