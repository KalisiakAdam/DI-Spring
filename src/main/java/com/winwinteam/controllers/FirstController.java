package com.winwinteam.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by kalisiaczki on 03.08.2017.
 */

@Controller
public class FirstController {

    public String hello(){
        System.out.println("hello");

        return "foo";
    }
}
