package com.example.springboottest.androidtest.service;

import com.example.springboottest.androidtest.dto.AndoridLoginTestDto;
import com.example.springboottest.androidtest.dto.AndroidSaveRequestTestDto;
import com.example.springboottest.androidtest.repository.useraccount.UserAccount;

import java.util.Optional;

public interface AndroidTestService {

    public Long save(AndroidSaveRequestTestDto requestDto);
    public Optional<UserAccount> findUser(AndoridLoginTestDto requestDto);

}
