package com.chriswk.collection.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
