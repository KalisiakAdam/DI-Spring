package com.winwinteam.controllers;

import com.winwinteam.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by kalisiaczki on 03.08.2017.
 */
@Controller
public class SetterInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
