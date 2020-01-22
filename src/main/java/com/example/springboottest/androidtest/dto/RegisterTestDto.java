package com.example.springboottest.androidtest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class RegisterTestDto {

    private String email;
    private String password;
    private String school;
    private String grade;
    private String major;

    @Builder
    public RegisterTestDto(String email, String password, String school, String grade, String major){
        this.email = email;
        this.password = password;
        this.school = school;
        this.grade = grade;
        this.major = major;
    }

}
