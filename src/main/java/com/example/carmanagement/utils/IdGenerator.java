package com.example.carmanagement.utils;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class IdGenerator {
	
	private IdGenerator() {}

	public static long nextId() {
		Date date = new Date();
		return date.getTime();
	}
}
