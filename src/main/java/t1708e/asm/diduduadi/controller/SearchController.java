package t1708e.asm.diduduadi.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import t1708e.asm.diduduadi.dto.PlaceDTO;
import t1708e.asm.diduduadi.dto.PostDTO;
import t1708e.asm.diduduadi.service.search.SearchService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping(value = "/search")
public class SearchController {
    @Autowired
    SearchService searchService;

    @RequestMapping(method = RequestMethod.GET)
    public String searchAll(@RequestParam("key") String key, Model model) throws RemoteException {

        PostDTO[] postList = new Gson().fromJson(searchService.searchByPost(key),PostDTO[].class);
        List<PostDTO> a = new ArrayList<PostDTO>();
        if (postList != null){
            a = Arrays.asList(postList);
        }

        PlaceDTO[] placeList = new Gson().fromJson(searchService.searchByPlace(key),PlaceDTO[].class);
        model.addAttribute("posts", a);
        model.addAttribute("places", placeList);
        return "search/list";
    }


}
