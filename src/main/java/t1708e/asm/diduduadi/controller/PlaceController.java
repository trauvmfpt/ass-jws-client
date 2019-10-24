package t1708e.asm.diduduadi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.asm.diduduadi.entity.*;
import t1708e.asm.diduduadi.service.place.PlaceService;

import javax.validation.Valid;
import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/place")
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
    public String create(Place place){ return "place/form"; }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store(Place place, BindingResult bindingResult) throws RemoteException {
        placeService.createPlace(place);
        return "redirect:/place/list/";
}
  
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public String list(){
        return "place/list";
    }
}
