package com.example.springboottest.web;

import com.example.springboottest.config.auth.LoginUser;
import com.example.springboottest.config.auth.dto.SessionUser;
import com.example.springboottest.domain.user.User;
import com.example.springboottest.service.posts.PostsService;
import com.example.springboottest.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

//    @GetMapping("/")
//    public String index()
//    {
//        return "index";
//    }

    @GetMapping("/posts/save")
    public String postsSave()
    {
        return "posts-save";
    }

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user)   /* 기존에(User) httpSession.getAttribute("user")로 가져오던 세션 정보 값이 개선됨 / 이제는 어느 컨트롤러든지 @LoginUser만 사용하면 세션 정보를 가져올 수 있게 됨*/
    {
        model.addAttribute("posts", postsService.findAllDesc());

        if(user != null)
        {
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model)
    {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
/* 200110T 1703 test*/