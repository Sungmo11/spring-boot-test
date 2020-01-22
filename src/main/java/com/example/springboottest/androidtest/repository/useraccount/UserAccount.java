package com.example.springboottest.androidtest.repository.useraccount;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)  /* BaseTimeEntity 클래스에 Auditing 기능을 포함시킵니다.*/
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_no;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

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
