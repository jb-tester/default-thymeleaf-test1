package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:context.xml")
public class DefaultThymeleafTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(DefaultThymeleafTest1Application.class, args);
	}
}
