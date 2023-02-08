package com.example.urlhitcounter.controller;

import com.example.urlhitcounter.model.Visitor;
import com.example.urlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitors_count")
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

//    @GetMapping("/count")
//    public Visitor getCount()
//    {
//        return urlHitService.getCount();
//    }

    //    Additional Task
    @GetMapping("/user/{user}/count")
    public Visitor getCount(@PathVariable String user)
    {
        return urlHitService.getCount(user);
    }
}