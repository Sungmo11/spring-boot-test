package com.example.springboottest.androidtest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class AndroidTestController {

    @RequestMapping(value = "/string", method = RequestMethod.POST)
    public String test()
    {
        System.out.println("Android Test !!");
        return "test";
    }

    @RequestMapping(value = "/jsonTest", method = RequestMethod.POST)
    public AndroidTestDto jsonTest(@RequestBody AndroidTestDto testDto)
    {
        System.out.println(
                "JSONTest : "
                + "user : " + testDto.getUser()
                + ", name : " + testDto.getName()
                + ", pw : " + testDto.getPw()
        );

        AndroidTestDto resultDto = AndroidTestDto.builder().user(-1).name("testnameOk").pw("testpwOk").build();

        return resultDto;
    }
}
