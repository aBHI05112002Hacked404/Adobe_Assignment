package com.adobe.exception;

import java.time.LocalDateTime;

import lombok.Data;


public class MyErrorDetails {

	private String error;
	private String details;
	private LocalDateTime timestamp;
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	public MyErrorDetails(String error, String details, LocalDateTime timestamp) {
		super();
		this.error = error;
		this.details = details;
		this.timestamp = timestamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	

}
