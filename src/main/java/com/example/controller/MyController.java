package com.example.controller;

import com.example.config.Myconfig;
import com.example.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    private final MyService myService;
    private final Myconfig myConfig;

    @Autowired
    public MyController(MyService myService, Myconfig myConfig) {
        this.myService = myService;
        this.myConfig = myConfig;
    }

    @GetMapping("/test")
    public String get() {
        return "test";
    }

    @PostMapping
    public String create(){
        return "test";
    }

    @PutMapping
    public String update(){
        return "test";
    }

    @DeleteMapping
    public String delete(){
        return "test";
    }
}
