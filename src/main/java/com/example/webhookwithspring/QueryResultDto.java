package com.example.webhookwithspring;

public class QueryResultDto {
	ParametersDto parameters;
	IntentDto intent;
	public ParametersDto getParametersdto() {
		return parameters;
	}
	public void setParametersdto(ParametersDto parametersdto) {
		this.parameters = parametersdto;
	}
	public IntentDto getIntentdto() {
		return intent;
	}
	public void setIntentdto(IntentDto intentdto) {
		this.intent = intentdto;
	}
	public QueryResultDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryResultDto(ParametersDto parametersdto, IntentDto intentdto) {
		super();
		this.parameters = parametersdto;
		this.intent = intentdto;
	}
	
	
}
