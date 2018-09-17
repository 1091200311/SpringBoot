package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String getHello(){
        return "Hello Spring Boot!";
    }
}
