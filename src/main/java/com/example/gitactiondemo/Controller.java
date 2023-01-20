package com.example.gitactiondemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("git")
    public String getMessage(){
        return "Hello from git";
    }

}
