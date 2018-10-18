package com.mytests.springboot.webapp.defaults.thymeleaf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtraConfig {

    @Bean
    public Bean1 bean1(){
        return new Bean1();
    }
}
