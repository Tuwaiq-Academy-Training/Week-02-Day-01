package com.example.springday01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @RequestMapping(path = "/user",method = RequestMethod.GET)
    public String helloMessage(){
        return "Saleh";
    }
}
