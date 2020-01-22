package com.example.springboottest.androidtest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class AndroidLoginResponseTestDto {

    private String email;
    private String password;
    private String status;

    @Builder
    public AndroidLoginResponseTestDto(String email, String password, String status){
        this.email = email;
        this.password = password;
        this.status = status;
    }

}
