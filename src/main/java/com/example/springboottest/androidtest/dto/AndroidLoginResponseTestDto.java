package com.example.springboottest.androidtest.dto;

import lombok.*;

@Getter @Setter
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
