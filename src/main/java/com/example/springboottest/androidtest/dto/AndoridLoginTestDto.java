package com.example.springboottest.androidtest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class AndoridLoginTestDto {

    private String email;
    private String password;

    @Builder
    public AndoridLoginTestDto(String email, String password){
        this.email = email;
        this.password = password;
    }

}
