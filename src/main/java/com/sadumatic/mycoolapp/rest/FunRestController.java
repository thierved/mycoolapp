package com.sadumatic.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World? the current Time is : " + LocalDateTime.now();
    }

    @GetMapping("/test")
    public String testing() {
        return "Good!";
    }
}
