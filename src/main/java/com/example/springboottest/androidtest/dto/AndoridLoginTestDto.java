package com.example.springboottest.androidtest.dto;

import lombok.*;

@Getter @Setter
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
