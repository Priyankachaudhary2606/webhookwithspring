package com.example.webhookwithspring;

public class MyWebhookDto {
	String fulfillmentText;
	IntentDto intent;
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	public IntentDto getIntent() {
		return intent;
	}
	public void setIntent(IntentDto intent) {
		this.intent = intent;
	}
	public MyWebhookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyWebhookDto(String fulfillmentText) {
		super();
		this.fulfillmentText = fulfillmentText; 
		this.intent = new IntentDto("myIntentname", "my Intent Display Name");
	}

	
	
	
}
