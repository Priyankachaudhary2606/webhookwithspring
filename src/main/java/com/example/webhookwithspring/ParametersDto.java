package com.example.webhookwithspring;

public class ParametersDto {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ParametersDto(String name) {
		super();
		this.name = name;
		System.out.println("Name Parameter in ParametersDto"+ this.name);
	}

	public ParametersDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
