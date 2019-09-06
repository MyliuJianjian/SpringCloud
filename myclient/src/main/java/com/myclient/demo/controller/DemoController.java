package com.myclient.demo.controller;

import com.myclient.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/myclient/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Value("${test}")
    private String test;

    @GetMapping("/test")
    public String getTest()
    {
        return test;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return demoService.hiService(name);
    }

}
