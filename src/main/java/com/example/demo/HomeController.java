package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")   // maps to http://localhost:8080/
    public String home() {
        return "Welcome to Demo Application!";
    }

    @GetMapping("/hello")   // maps to http://localhost:8080/hello
    public String hello() {
        return "Hello, World!";
    }
}

