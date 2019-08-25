 package com.OnlineShopping.shoppinguserprofile.code.common;

import java.util.List;

public class ServiceResponse{
	private Integer statusCode;
	private List<Exception> errorList;
	private Object response;

	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public List<Exception> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<Exception> errorList) {
		this.errorList = errorList;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
}