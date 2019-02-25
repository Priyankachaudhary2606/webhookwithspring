package com.example.webhookwithspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/myapp")
	public MyWebhookDto myfunc() {
		System.out.println("Hello World");
		return new MyWebhookDto("Hello World");
	}
}
