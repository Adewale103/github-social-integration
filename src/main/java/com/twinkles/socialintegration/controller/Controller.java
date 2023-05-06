package com.twinkles.socialintegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @GetMapping("/")
    public String justTesting(){
        return "Now I know who you are!";
    }


}
