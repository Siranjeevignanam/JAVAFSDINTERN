package com.test.exceptions;

import java.util.Date;

public class ErrorMessage {

	@Override
	public String toString() {
		return "ErrorMessage [url=" + url + ", timeStamp=" + timeStamp + ", message=" + message + ", statusCode="
				+ statusCode + "]";
	}
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	private Date timeStamp;
	private String message;
	private int statusCode;
	
}
