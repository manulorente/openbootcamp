package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        

        // CONCEPT: Spring IoC Container
        // Option 1 - Create object directly
        // CalculatorService service = new CalculatorService();

        // Option 2 - Get object from Spring context
        CalculatorService calculator = context.getBean("calculatorService", CalculatorService.class);
        System.out.println(calculator.helloWorld());

        // We can also get the object from the context using the class name without call the constructor
        CalculatorService calculator2 = context.getBean("calculatorService", CalculatorService.class);
        System.out.println(calculator2.helloWorld());

        // CONCEPT 2 - Dependency Injection. We load a bean (calculator) that depends on another bean
        InvoicesManager mngr = (InvoicesManager)context.getBean("invoicesManager");
        System.out.println(mngr.calculator.helloWorld());

        // CONCEPT 3 - Spring Bean Scopes
        // Singleton - Default scope. Object is created and shared between all the classes that need it.
        // Prototype - Object is created every time it is requested.

    }
}
