package com.raygraves.grams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "com.raygraves.grams")
public class GramsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GramsApplication.class, args);
    }
}