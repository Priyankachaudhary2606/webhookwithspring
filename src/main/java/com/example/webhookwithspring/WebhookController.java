package com.example.webhookwithspring;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.actions.api.App;

@RestController
public class WebhookController {
	
	private final App actionsApp = new IntentApp();
	
	@RequestMapping(value = "/myapp", method = RequestMethod.POST, produces = { "application/json" })
	public String servingAction(@RequestBody String body, @RequestHeader Map<String, String> headers) {
		try {
			return actionsApp.handleRequest(body, headers).get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return handleError(e);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return handleError(e);
		}
//		return "Hello";
	}
	
	 private String handleError(Exception e) {
         e.printStackTrace();
         return "Error handling the intent - " + e.getMessage();
     }

}
