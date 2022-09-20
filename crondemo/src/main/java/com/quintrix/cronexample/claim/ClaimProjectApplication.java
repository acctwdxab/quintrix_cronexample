package com.quintrix.cronexample.claim;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;




@SpringBootApplication
@EnableScheduling
public class ClaimProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimProjectApplication.class,args);

	}

}
