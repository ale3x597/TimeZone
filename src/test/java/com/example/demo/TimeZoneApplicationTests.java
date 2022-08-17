package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest
class TimeZoneApplicationTests {
	
	
	@Autowired
	private TimeZoneController controller;
	
	
	@Test
	void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}
	
	@Test
	void matchingTimeZones() {
		assert(ZonedDateTime.now().getOffset().equals(ZoneOffset.of("-4")));
	}

	@Test
	void MoreMatchingTimeZones() {
		assertFalse(ZonedDateTime.now().getOffset().equals(ZoneOffset.of("-5")));
	}

	private void assertFalse(boolean equals) {
		// TODO Auto-generated method stub
		
	}
}
