package t1708e.asm.diduduadi.controller;


import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.asm.diduduadi.dto.PlaceDTO;
import t1708e.asm.diduduadi.dto.PostDTO;
import t1708e.asm.diduduadi.entity.Place;
import t1708e.asm.diduduadi.service.place.PlaceService;
import t1708e.asm.diduduadi.service.post.PostService;


import java.rmi.RemoteException;
import java.util.*;
import java.util.stream.Collectors;


@Controller
@RequestMapping(value = "/place")
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @Autowired
    PostService postService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String detail(@PathVariable int id, Model model) throws RemoteException{
        PlaceDTO place = new Gson().fromJson(placeService.detailPlace(id),PlaceDTO.class);

        PlaceDTO[] placesarr = new Gson().fromJson(placeService.getListPlace(),PlaceDTO[].class);
        List<PlaceDTO> places = new ArrayList<>();
        if (placesarr!= null){
            places = Arrays.asList(placesarr);
        }

        model.addAttribute("places", places);
        model.addAttribute("place", place);
        model.addAttribute("posts", place.getPosts());

        return "place/detail";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String layout(){
        return "fragment/layout";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model)
    {
        model.addAttribute("place", new Place());
        return "place/form";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store(Place place, BindingResult bindingResult) throws RemoteException {
        placeService.createPlace(new Gson().toJson(place));
        return "redirect:/place/list/";
}
  
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public String list(Model model) throws RemoteException {
        PlaceDTO[] placesarr = new Gson().fromJson(placeService.getListPlace(),PlaceDTO[].class);
        List<PlaceDTO> places = new ArrayList<>();
        if (placesarr!= null){
            places = Arrays.asList(placesarr);
        }
        model.addAttribute("places", places);
        return "place/list";
    }
}
