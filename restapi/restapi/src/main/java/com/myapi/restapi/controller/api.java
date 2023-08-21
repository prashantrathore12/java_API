package com.myapi.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class api {
    @GetMapping
    public String home(){
        return "Welcome";
    }
}
