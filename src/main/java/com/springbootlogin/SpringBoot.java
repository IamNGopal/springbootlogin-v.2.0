package com.springbootlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringBoot extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("coming..");
		SpringApplication.run(SpringBoot.class, args);
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBoot.class);
    }
	
	
}
