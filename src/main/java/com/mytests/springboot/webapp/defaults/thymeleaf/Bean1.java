package com.mytests.springboot.webapp.defaults.thymeleaf;

import org.springframework.beans.factory.annotation.Value;

public class Bean1 {
    @Value("bean from extra config")
    String str;

    public String getStr() {
        return str;
    }
}
