package com.edwise.pocs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public String hola;
    public String hastaluego;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
