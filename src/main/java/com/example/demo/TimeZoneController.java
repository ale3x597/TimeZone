package com.example.demo;

import java.time.ZonedDateTime;

import javax.management.AttributeNotFoundException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeZoneController {
	
	
	@PostMapping("/timezone")
	public ZonedDateTime getTimeOutput(@RequestBody TimeZones tz) throws AttributeNotFoundException {
		return tz.getZoneDateTime();
	}
	

}
