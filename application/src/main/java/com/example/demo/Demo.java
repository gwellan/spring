package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo extends SpringApplication {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication();
        sa.run(args);
    }
}