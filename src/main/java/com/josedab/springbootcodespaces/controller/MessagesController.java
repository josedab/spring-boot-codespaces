package com.josedab.springbootcodespaces.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {

    @GetMapping("/messages")
    public String getMethodName() {
        return "Messages index";
    }

}
