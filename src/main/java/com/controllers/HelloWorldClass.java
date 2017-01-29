package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by VarunKonduru on 1/29/17.
 */
@Controller
public class HelloWorldClass {

    @RequestMapping("/")
    public String helloWorld(){
        return "index";
    }
}
