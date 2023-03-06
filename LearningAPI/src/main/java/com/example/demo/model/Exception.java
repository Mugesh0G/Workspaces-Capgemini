package com.example.demo.model;

public class Exception {
	private String error;
	private String errorMessgae;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorMessgae() {
		return errorMessgae;
	}
	public void setErrorMessgae(String errorMessgae) {
		this.errorMessgae = errorMessgae;
	}
	public Exception(String error, String errorMessgae) {
		super();
		this.error = error;
		this.errorMessgae = errorMessgae;
	}
	public Exception() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
