package t1708e.asm.diduduadi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/places")
public class PlaceController {
    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public String detail(){
        return "place/detail";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String layout(){
        return "fragment/layout";
    }
}
