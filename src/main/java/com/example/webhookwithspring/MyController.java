package com.example.webhookwithspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/myapp")
	public String myfunc() {
		System.out.println("Hello World");
		return "a";
	}
}
