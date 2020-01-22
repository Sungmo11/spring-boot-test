package com.example.springboottest.androidtest.dto;

import com.example.springboottest.androidtest.repository.useraccount.UserAccount;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AndroidSaveRequestTestDto {

    private String email;
    private String password;

    @Builder
    public AndroidSaveRequestTestDto(String email, String password){
        this.email = email;
        this.password = password;
    }

    public UserAccount toEntity(){
        return UserAccount
                .builder()
                .email(email)
                .password(password)
                .build();
    }
}
