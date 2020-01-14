package com.example.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaAuditing  // JPA Auditing 활성화
@SpringBootApplication
public class SpringBootTestApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }

}
/* 200110T 1703 test*/