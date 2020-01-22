package com.example.springboottest.androidtest.controller;

import com.example.springboottest.androidtest.dto.AndroidSaveRequestTestDto;
import com.example.springboottest.androidtest.dto.AndroidTestDto;
import com.example.springboottest.androidtest.dto.RegisterTestDto;
import com.example.springboottest.androidtest.service.AndroidTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/test")
public class AndroidTestController {

    private final AndroidTestService androidTestService;

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

    @RequestMapping(value = "/registerTest", method = RequestMethod.POST)
    public RegisterTestDto registerTest(@RequestBody RegisterTestDto registerTestDto)
    {
        System.out.println(
                "JSONObject : " + registerTestDto.toString()
        );

        AndroidSaveRequestTestDto requestTestDto =
                AndroidSaveRequestTestDto
                        .builder()
                        .email(registerTestDto.getEmail())
                        .password(registerTestDto.getPassword())
                        .build();

        Long i = androidTestService.save(requestTestDto);

        RegisterTestDto registerTestDto1 = RegisterTestDto.builder().status("SUCCESS").build();

        System.out.println(
                "androidTestService.save(requestTestDto) : " + i
        );

        return registerTestDto1;
    }


}
