package com.example.demo.model;

public class FieldErrorMessage {
	private String field;
	private String errorMessage;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public FieldErrorMessage(String field, String errorMessage) {
		super();
		this.field = field;
		this.errorMessage = errorMessage;
	}
	public FieldErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
