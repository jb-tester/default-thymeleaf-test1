package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest1;

import com.mytests.springboot.webapp.defaults.thymeleaf.ExtraConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:context.xml")
@Import(ExtraConfig.class)
public class DefaultThymeleafTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(DefaultThymeleafTest1Application.class, args);
	}
}
