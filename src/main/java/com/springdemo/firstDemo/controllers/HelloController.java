package com.springdemo.firstDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "Greeting from Spring Boot!";
    }

    @GetMapping("/show-text")
    public String showText(){
        return "Hello this testing route showing a text!";
    }

}
