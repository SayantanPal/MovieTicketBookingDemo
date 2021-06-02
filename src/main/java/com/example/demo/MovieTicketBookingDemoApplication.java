package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"com.*"})
public class MovieTicketBookingDemoApplication //extends SpringBootServletInitializer
{//Change Class name

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingDemoApplication.class, args);//Change Class name
	}

}