package com.myserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/myserver/demo")
public class DemoController {

    @Value("${test}")
    private String test;

    @GetMapping("/test")
    public String getTest()
    {
        return test;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        System.out.println(name+" welcome . My is microservice provider user");
        return name+" welcome . My is microservice provider user two";
    }

}
