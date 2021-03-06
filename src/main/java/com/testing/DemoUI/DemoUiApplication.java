package com.testing.DemoUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoUiApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("hi....");
		System.out.println("helloWorld!....");
		return application.sources(DemoUiApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoUiApplication.class, args);
	}
}
