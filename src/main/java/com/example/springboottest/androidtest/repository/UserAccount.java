package com.example.springboottest.androidtest.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_no;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String status;

    @CreatedDate /*Entity가 생성되어 저장될 때 시간이 자동 저장됩니다.*/
    private LocalDateTime registered;

    @LastModifiedDate   /* 조회한 Entity의 값을 변경할 때 시간이 자동 저장됩니다.*/
    private LocalDateTime updated;

    @Builder
    public UserAccount(Long account_no, String email, String password, String status) {
        this.account_no = account_no;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public UserAccount update(String email, String password){
        this.email = email;
        this.password = password;

        return this;
    }

}
