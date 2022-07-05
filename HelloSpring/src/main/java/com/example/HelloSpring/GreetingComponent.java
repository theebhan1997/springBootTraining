package com.example.HelloSpring;

import org.springframework.stereotype.Component;

@Component
public class GreetingComponent {
	
	public String getMessage() {
		return "Hello from Greeting Components";
	}
}
