package com.ariye.lakeTours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    @Autowired

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);


    }

    private static void startApplication() {
        System.out.println("Welcome to Lake Tours ltd! ");

    }

}
