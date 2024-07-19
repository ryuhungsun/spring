package com.jusung.app.dto;

import lombok.Data;

@Data
public class ResultDTO {
	private Boolean state;
	private Object result;
	private String message;
	
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
