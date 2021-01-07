package com.finastra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiAppApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(RestApiAppApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiAppApplication.class, args);
	}

}
