package com.example.springboottest.androidtest.service;

import com.example.springboottest.androidtest.dto.AndroidSaveRequestTestDto;
import com.example.springboottest.web.dto.PostsSaveRequestDto;

public interface AndroidTestService {

    public Long save(AndroidSaveRequestTestDto requestDto);
}
