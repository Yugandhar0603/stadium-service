package com.cricket.stadium_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StadiumServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StadiumServiceApplication.class, args);
	}

}
//Description:

//Field stadiumService in com.cricket.stadium_service.controller.StadiumController required a bean of type 'com.cricket.stadium_service.service.StadiumService' that could not be found.
//
//The injection point has the following annotations:
//	- @org.springframework.beans.factory.annotation.Autowired(required=true)
//
//
//Action:
//
//Consider defining a bean of type 'com.cricket.stadium_service.service.StadiumService' in your configuration.
