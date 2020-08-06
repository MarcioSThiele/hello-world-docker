package com.helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class Controller {

    @GetMapping
    public String sendMessage() {
        //System.out.println("Hello World");
        return "<h1>Hello World!</h1>";
    }
}
