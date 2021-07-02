package com.samspain.springpetclinic.controllers;

import com.samspain.springpetclinic.services.EnglishGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetterBasedControllerTest {

    SetterBasedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setGreetingService(new EnglishGreetingService());
    }

    @Test
    void getGreeting() {
        assertEquals(setterBasedController.getGreeting(), "Hello world");
    }
}