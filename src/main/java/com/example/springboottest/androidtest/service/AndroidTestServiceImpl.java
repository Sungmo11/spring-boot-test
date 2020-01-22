package com.example.springboottest.androidtest.service;

import com.example.springboottest.androidtest.dto.AndoridLoginTestDto;
import com.example.springboottest.androidtest.dto.AndroidLoginResponseTestDto;
import com.example.springboottest.androidtest.dto.AndroidSaveRequestTestDto;
import com.example.springboottest.androidtest.repository.useraccount.UserAccount;
import com.example.springboottest.androidtest.repository.useraccount.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AndroidTestServiceImpl implements AndroidTestService {

    private final UserAccountRepository userAccountRepository;

    @Override
    public Long save(AndroidSaveRequestTestDto requestDto) {
        return userAccountRepository.save(requestDto.toEntity()).getAccount_no();
    }

    @Override
    public AndroidLoginResponseTestDto findUser(AndoridLoginTestDto requestDto) {
        UserAccount account = userAccountRepository.findByEmail(requestDto.getEmail());

        if (account == null){
            return AndroidLoginResponseTestDto.builder().status("fail").build();
        }

        return AndroidLoginResponseTestDto.builder().email(account.getEmail()).password(account.getPassword()).status("SUCCESS").build();
    }


}
