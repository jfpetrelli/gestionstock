package com.admin.gestionstock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class views {
    @GetMapping("/")
    public String index(){
        return "Hola mundo";
    }
}
