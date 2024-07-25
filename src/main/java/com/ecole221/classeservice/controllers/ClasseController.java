package com.ecole221.classeservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/classes")
public class ClasseController {

    @GetMapping
    public String index(){
        return "Hello World";
    }
}
