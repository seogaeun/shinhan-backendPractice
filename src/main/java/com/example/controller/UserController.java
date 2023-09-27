package com.example.controller;


import com.example.domain.request.UserRequest;
import com.example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/api/v1/user/join")
    public void join(
            @RequestBody UserRequest userRequest
    ) {
        userService.join(userRequest);
    }

    @GetMapping("/home")
    public String home(){
        return "안녕~~";
    }

    @GetMapping("/admin")
    public String admin(){
        return "관리자 화면~~";
    }

    @GetMapping("/manager")
    public String manager(){
        return "매니저 접속 가능한 화면~~";
    }
}