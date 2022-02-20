package com.create.abstractfactory.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public ShipFactory bye() {
        return new ShipFactory();
    }

}
