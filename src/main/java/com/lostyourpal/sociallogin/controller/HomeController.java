package com.lostyourpal.sociallogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public  String home(){
        return "hello, Home!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "hello, secured!";
    }
}
