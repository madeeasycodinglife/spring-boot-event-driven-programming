package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootEventDrivenProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventDrivenProgrammingApplication.class, args);
	}

}
