package com.test.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.test.exceptions.ErrorMessage;

@ControllerAdvice
public class GlobalExceptionalHandler {
	
	public ResponseEntity<ErrorMessage>
	orderNotFoundException(OrderNotFoundException onfe)
	{
		ErrorMessage msg = new ErrorMessage();
		
		int statusCode = HttpStatus.NOT_FOUND.value();
		
		String desc = request.getDescription(false);
		
		msg.setTimeStamp(new Date());
		
		msg.setMessage(onfe.getMessage());
		msg.setUrl(desc);
		msg.setStatusCode(statusCode);
		
		return new ResponseEntity<ErrorMessage>(msg,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> unknownExceptions(Exception e)
	{
		ErrorMessage msg = new ErrorMessage();
		int statusCode = HttpStatus.NO_CONTENT.value();
		String url = request.getDescription(false);
		
		msg.setTimeStamp(new Date());
		msg.setMessage(e.getMessage());
		msg.setUrl(url);
		msg.setStatusCode(statusCode);
		
		
	}
}
