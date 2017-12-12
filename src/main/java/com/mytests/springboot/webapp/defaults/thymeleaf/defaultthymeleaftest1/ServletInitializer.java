package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest1;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DefaultThymeleafTest1Application.class);
	}

}
