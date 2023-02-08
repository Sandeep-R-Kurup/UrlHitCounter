package com.example.urlhitcounter.service;

import com.example.urlhitcounter.model.Visitor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class UrlHitService {


    //Basic Task
//    private static int count=0;

//    public Visitor getCount()
//    {
//        Visitor visitor=new Visitor(++count);
//        return visitor;
//    }


    //Additional Task
    HashMap<String,Integer> map=new HashMap<>();
    public Visitor getCount(String username)
    {

        map.put(username,map.getOrDefault(username,0)+1);
        Visitor visitor=new Visitor(username,map.get(username));
        return visitor;
    }
}