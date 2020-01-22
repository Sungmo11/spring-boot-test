package com.example.springboottest.androidtest.controller;

import com.example.springboottest.androidtest.dto.*;
import com.example.springboottest.androidtest.repository.useraccount.UserAccount;
import com.example.springboottest.androidtest.service.AndroidTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

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

    // 로그인요청을 받는곳
    @RequestMapping(value = "/loginTest", method = RequestMethod.POST)
    public AndroidLoginResponseTestDto loginTest(@RequestBody AndoridLoginTestDto andoridLoginTestDto){

        System.out.println(
                "LoginJSONObject : " + andoridLoginTestDto.toString()
                + ", findUser : " + androidTestService.findUser(andoridLoginTestDto).toString()
        );

        AndroidLoginResponseTestDto androidLoginResponseTestDto = androidTestService.findUser(andoridLoginTestDto);
        androidLoginResponseTestDto.setStatus("SUCCESS");

        return androidLoginResponseTestDto;
    }

    // 회원요청을 받는곳
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
