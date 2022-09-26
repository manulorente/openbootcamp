package com.example;

public class InvoicesManager {

    CalculatorService calculator;

    public InvoicesManager(CalculatorService calculator) {
        System.out.println("InvoicesManager instantiated");
        this.calculator = calculator;
    }

    
}
