package t1708e.asm.diduduadi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.asm.diduduadi.entity.Place;
import t1708e.asm.diduduadi.entity.Post;
import t1708e.asm.diduduadi.service.place.PlaceService;
import t1708e.asm.diduduadi.service.post.PostService;

import java.rmi.RemoteException;
import java.util.*;

@Controller
@RequestMapping(value = "/places")
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @Autowired
    PostService postService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String detail(@PathVariable int id, Model model) throws RemoteException{
        Place place = placeService.detailPlace(id);

        Post[] listPost = place.getPostSet();
        List<Post> posts = new ArrayList<>();
        if (listPost != null){
            posts = Arrays.asList(listPost);
        }
        model.addAttribute("place", place);
        model.addAttribute("posts", posts);
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
            System.out.println(places.get(i).getName() + ' ' + places.get(i).getAddress() +  ' ' + places.get(i).getId() );
        }
        model.addAttribute("places", places);
        return "place/list";
    }
}
