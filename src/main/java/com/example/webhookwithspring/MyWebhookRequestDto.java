package com.example.webhookwithspring;



public class MyWebhookRequestDto {
	QueryResultDto queryResult;

	public QueryResultDto getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResultDto queryResult) {
		this.queryResult = queryResult;
	}

	public MyWebhookRequestDto(QueryResultDto queryResult) {
		super();
		System.out.println("Inside Webhook Request");
		this.queryResult = queryResult;
	}

	public MyWebhookRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
