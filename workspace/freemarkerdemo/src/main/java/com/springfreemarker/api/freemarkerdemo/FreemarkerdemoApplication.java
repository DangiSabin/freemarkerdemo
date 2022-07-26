package com.springfreemarker.api.freemarkerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springfreemarker.api.controller.ApplicationController;

@SpringBootApplication
@ComponentScan(basePackageClasses=ApplicationController.class)
public class FreemarkerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreemarkerdemoApplication.class, args);
	}

}
