package com.example.JavaRestMicroCICDKuberDocker.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;
@Data
public class MovieException {

	private String message;
	private Throwable throwable;
	private HttpStatus statusCode;
	public MovieException(String message, Throwable throwable, HttpStatus statusCode) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.statusCode = statusCode;
	}
	
	
}
