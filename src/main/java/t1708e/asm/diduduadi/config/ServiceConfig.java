package t1708e.asm.diduduadi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t1708e.asm.diduduadi.service.place.PlaceService;
import t1708e.asm.diduduadi.service.place.PlaceServiceServiceLocator;

import javax.xml.rpc.ServiceException;

@Configuration
public class ServiceConfig {

    @Bean
    PlaceService placeService() throws ServiceException {
        PlaceServiceServiceLocator locator = new PlaceServiceServiceLocator();
        PlaceService placeService = locator.getPlaceServicePort();
        return placeService;
    }
}
