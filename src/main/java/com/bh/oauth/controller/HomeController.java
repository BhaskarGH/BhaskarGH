package com.bh.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Hello, Home!";
    }
    @GetMapping("/secured")
    public String secured(){
        return "Hello, Secured";
    }
    @GetMapping("/check")
    public String login(){
        return "Hello, Secured";
    }

}
