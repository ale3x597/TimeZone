package com.example.demo;

import java.time.ZoneId;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimeZoneApplication {
	
	//Write Post request at address below to check
		//localhost:8080/timezone
		// All Available Timezones displayed in console
	
	public static void main(String[] args) {
		Set <String> zone = ZoneId.getAvailableZoneIds();
		Stream.of(zone).forEach((Zid)-> System.out.println(Zid));
		
		SpringApplication.run(TimeZoneApplication.class, args);
		
	}

}
