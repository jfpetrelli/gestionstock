package com.admin.gestionstock.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @RequestMapping(value = "prueba")
    public String prueba(){
        return "Prueba";
    }
    
}
