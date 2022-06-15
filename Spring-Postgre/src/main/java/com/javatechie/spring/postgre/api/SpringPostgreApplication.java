package com.javatechie.spring.postgre.api;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringPostgreApplication {

	
	public static void main(String[] args) {	
	      new SpringApplicationBuilder(SpringPostgreApplication.class).web(WebApplicationType.NONE).run(args);
	}
}
