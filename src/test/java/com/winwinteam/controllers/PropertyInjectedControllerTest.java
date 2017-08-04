package com.winwinteam.controllers;

import com.winwinteam.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kalisiaczki on 03.08.2017.
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();

    }

    @Test
    public void testGreeting() throws Exception {

        assertEquals(GreetingServiceImpl.HELLO_ADAM, propertyInjectedController.sayHello());

    }

}
