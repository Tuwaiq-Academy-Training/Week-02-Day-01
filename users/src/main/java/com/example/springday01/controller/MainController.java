package com.example.springday01.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController

public class MainController {

    @RequestMapping(path = "/hey",method = RequestMethod.GET)
    public String helloMessage(){
        return "Hey from spring";
    }

    @RequestMapping(path = "/hey",method = RequestMethod.POST)
    public String helloMessage2(){
        return "Hey from spring 2";
    }

    @RequestMapping(path = "/hey/welcome",method = RequestMethod.GET)
    public String helloMessage3(){


        return "Hey welcome to spring";
    }

    @RequestMapping(path = "/date",method = RequestMethod.GET)
    public String todayDate(){
        Date date=new Date();
        return date.toString();
    }
}
