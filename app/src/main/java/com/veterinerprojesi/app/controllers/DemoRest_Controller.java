package com.veterinerprojesi.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoRest_Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Merhaba Dünya";
    }
}

