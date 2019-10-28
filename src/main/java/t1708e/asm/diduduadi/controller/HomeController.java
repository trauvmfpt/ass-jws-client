package t1708e.asm.diduduadi.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.asm.diduduadi.dto.PlaceDTO;
import t1708e.asm.diduduadi.service.place.PlaceService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    @Autowired
    PlaceService placeService;
    @RequestMapping(method = RequestMethod.GET)
    public String  home(Model model) throws RemoteException {
        PlaceDTO[] placesarr = new Gson().fromJson(placeService.getListPlace(),PlaceDTO[].class);
        List<PlaceDTO> places = new ArrayList<>();
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
