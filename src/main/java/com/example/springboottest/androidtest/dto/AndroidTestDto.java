package com.example.springboottest.androidtest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class AndroidTestDto {

    private int user;
    private String name;
    private String pw;

    @Builder
    public AndroidTestDto(int user, String name, String pw)
    {
        this.user = user;
        this.name = name;
        this.pw = pw;
    }
}
