package t1708e.asm.diduduadi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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

        Post[] postList = searchService.searchByPost(key);
        List<Post> a = new ArrayList<Post>();
        if (postList != null){
            a = Arrays.asList(postList);
        }

        Place[] placeList = searchService.searchByPlace(key);
        model.addAttribute("posts", a);
        model.addAttribute("places", placeList);
        return "search/list";
    }


}
