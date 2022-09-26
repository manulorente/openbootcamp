package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {

		// Get context of the app
		ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);

		// Get the bean of type CarRepository
		CarRepository repository = context.getBean(CarRepository.class);

		// Create a new car
		Car c1 = new Car((long) 0,"Ford", "Mustang", 1969);
		// Save the car
		repository.save(c1);
		System.out.println("Number of cars: " + repository.count());
		// Find all cars
		System.out.println("Find all cars:"  + repository.findAll());


	}

}
