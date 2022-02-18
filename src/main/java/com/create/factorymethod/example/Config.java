package com.create.factorymethod.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String bye() {
        return "bye";
    }

}
