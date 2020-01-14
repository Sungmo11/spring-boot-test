package com.example.springboottest.web;

import com.example.springboottest.web.dto.VisionDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/test/android")
public class AndroidController {

    @ResponseBody
    public Map<String, String> androidTestWithRequestAndResponse(HttpServletRequest request)
    {
        ArrayList<VisionDto> visionDto = new ArrayList<>();
        Map<String, String> result = new HashMap<>();
        String num = "test";
        String day="test";
        String content="test";

        result.put("num",num);
        result.put("day",day);
        result.put("content",content);

        return result;
    }
}
