package t1708e.asm.diduduadi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.asm.diduduadi.service.place.Place;
import t1708e.asm.diduduadi.service.place.PlaceService;

import java.rmi.RemoteException;
import java.util.*;

@Controller
@RequestMapping(value = "/places")
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public String detail(){
        return "place/detail";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String layout(){
        return "fragment/layout";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(){ return "place/form"; }
  
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public String list(Model model) throws RemoteException {
        Place[] placesarr = placeService.getListPlace();
        List<Place> places = new ArrayList<>();
        if (placesarr!= null){
            places = Arrays.asList(placesarr);
        }
        System.out.println(places.size());
        for (int i = 0; i < places.size(); i++){
            System.out.println(places.get(i).getName() + ' ' + places.get(i).getName() +  ' ' + places.get(i).getId() );
        }
        model.addAttribute("places", places);
        return "place/list";
    }
}
