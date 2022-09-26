package com.example.obspringdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository is a Spring annotation that tells Spring to create a bean for this class
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
