package com.example.springboottest.androidtest.service;

import com.example.springboottest.androidtest.dto.AndroidSaveRequestTestDto;
import com.example.springboottest.androidtest.repository.useraccount.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AndroidTestServiceImpl implements AndroidTestService {

    private final UserAccountRepository userAccountRepository;

    @Override
    public Long save(AndroidSaveRequestTestDto requestDto) {
        return userAccountRepository.save(requestDto.toEntity()).getAccount_no();
    }



}
