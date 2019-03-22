package com.example.webhookwithspring;

public class MyWebhookDto {
	String fulfillmentText;
	
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	
	public MyWebhookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyWebhookDto(String fulfillmentText) {
		super();
		this.fulfillmentText = fulfillmentText; 
//		this.intent = new IntentDto("myIntentname", "my Intent Display Name");
	}

	
	
	
}
