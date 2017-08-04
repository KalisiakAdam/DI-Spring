package com.winwinteam.controllers;


import com.winwinteam.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;


    public String sayHello() {
        return greetingService.sayGreeting();
    }






}

