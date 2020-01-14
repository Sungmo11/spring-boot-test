package com.example.springboottest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AndroidTestController {

    @RequestMapping("/test")
    public String test()
    {
        System.out.println("Android Test !!");
        return "test";
    }
}
