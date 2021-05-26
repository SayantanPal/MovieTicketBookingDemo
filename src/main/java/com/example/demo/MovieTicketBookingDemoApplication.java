package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.*"})
public class MovieTicketBookingDemoApplication {//Change Class name

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingDemoApplication.class, args);//Change Class name
	}

}