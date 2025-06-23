package com.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyPayApplication {
    public static void main(String[] args) {
        System.out.printf("Welcome to the GPay style full stack payment system!");
        SpringApplication.run(EasyPayApplication.class, args);
    }
}