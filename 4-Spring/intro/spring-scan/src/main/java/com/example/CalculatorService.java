package com.example;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public CalculatorService()
    {
        System.out.println("CalculatorService instantiated");
    }

    public String helloWorld() {
        return "Hello World!";
    }
}
