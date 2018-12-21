package com.jose.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   
/* 
 * Composed of the following annotations: @EnableAutoConfiguration, @ComponentScan, @Configuration 
 */
// In Spring Boot, you have recursive component scanning. If you have several base packages, you must use
// the "scanBasePackages" attribute as an argument of @SpringBootApplication.
// Load data from application.properties
// Do not use the src/main/webapp directory if your application is packaged as JAR.
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);  // Bootstrap the Spring Boot application
	}

}

