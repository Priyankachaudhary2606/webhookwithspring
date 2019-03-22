package com.example.webhookwithspring;

public class IntentDto {
	String name;
	String displayName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public IntentDto(String name, String displayName) {
		super();
		this.name = name;
		this.displayName = displayName;
		System.out.println("Intents"+ this.name + "    " + this.displayName);
	}
	public IntentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
