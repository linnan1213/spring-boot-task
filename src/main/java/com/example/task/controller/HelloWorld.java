package com.example.task.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "你好！";
    }

}
