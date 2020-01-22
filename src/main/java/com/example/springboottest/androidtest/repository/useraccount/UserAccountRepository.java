package com.example.springboottest.androidtest.repository.useraccount;

import com.example.springboottest.androidtest.dto.AndroidLoginResponseTestDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount,Long> {

    public UserAccount findByEmail(String email);

}
