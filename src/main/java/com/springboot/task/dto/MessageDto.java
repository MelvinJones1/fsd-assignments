package com.springboot.task.dto;


import org.springframework.stereotype.Component;

@Component
public class MessageDto {
	private String body;
	private int statusCode;
	
	public MessageDto(String body, int statusCode) {
		super();
		this.body = body;
		this.statusCode = statusCode;
	}
	
	

	public MessageDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	 

}