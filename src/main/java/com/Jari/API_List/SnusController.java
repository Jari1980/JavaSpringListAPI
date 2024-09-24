package com.Jari.API_List;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class SnusController {

    static ArrayList<Snus> snusList = new ArrayList<Snus>();


    @PostMapping("/snus/add")
    public void addSnus(@RequestBody Snus snus){
        System.out.println("Snus name: " + snus.name);
        System.out.println("Snus grade: " + snus.grade);
        snusList.add(snus);
    }

    @GetMapping("/snus")
    public ArrayList<Snus> getSnus(){
        return snusList;
    }

    //Using this to check verify list
    @GetMapping("/snus/details")
    public String getSnusName(@RequestParam int index){
        Snus snus = snusList.get(index);
        String name = snus.name;
        return name;
    }

}
