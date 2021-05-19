package com.webseries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class WebSeriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSeriesApplication.class, args);
	}

}
