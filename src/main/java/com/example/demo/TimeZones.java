package com.example.demo;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Component;


public class TimeZones {

	public String TimeOutput; 
	
	public TimeZones (String Test) {
		getTimeOutput(Test);
		
	}
	
	public ZonedDateTime getZoneDateTime() {
		ZonedDateTime Time = ZonedDateTime.now(ZoneId.of(TimeOutput));
		return Time;
		
	}
	
	public String getTimeOutput () {
		return TimeOutput;
	}
	
	public String getTimeOutput (String UserTime) {
		//'UTC' 'GMT' or 'UT"
		TimeOutput = ZoneOffset.of(UserTime).toString();
		
		return TimeOutput;
		
	}
	
	
}
