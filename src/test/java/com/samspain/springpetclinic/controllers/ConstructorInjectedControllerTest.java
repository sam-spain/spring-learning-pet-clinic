package com.samspain.springpetclinic.controllers;

import com.samspain.springpetclinic.services.EnglishGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new EnglishGreetingService());
    }

    @Test
    void getGreeting() {
        assertEquals(constructorInjectedController.getGreeting(), "Hello world");
    }
}