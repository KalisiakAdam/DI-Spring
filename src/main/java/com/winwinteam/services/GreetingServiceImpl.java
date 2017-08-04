package com.winwinteam.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

public static final String HELLO_ADAM = "Hello Adam!!!";

    @Override
    public String sayGreeting() {
        return HELLO_ADAM;
    }
}
