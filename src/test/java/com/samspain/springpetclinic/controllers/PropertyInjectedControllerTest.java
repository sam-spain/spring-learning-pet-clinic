package com.samspain.springpetclinic.controllers;

import com.samspain.springpetclinic.services.EnglishGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new EnglishGreetingService();
    }

    @Test
    void getGreeting() {
        assertEquals(propertyInjectedController.getGreeting(), "Hello world");
    }

}