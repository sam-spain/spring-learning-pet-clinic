package com.samspain.springpetclinic.controllers;

import com.samspain.springpetclinic.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
