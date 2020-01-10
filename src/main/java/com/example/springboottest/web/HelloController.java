package com.example.springboottest.web;

import com.example.springboottest.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name")String name,
                                     @RequestParam("amount")int amount)
    {
        return new HelloResponseDto(name,amount);
    }

    @GetMapping("/asd/asd/asd/asd")
    public String asdasd()
    {
        return "abc";
    }
}

/* 200110T 1703 test*/