package com.example.JavaRestMicroCICDKuberDocker.exception;

public class MovieNotFoundException extends RuntimeException{

//	private static final long serialVersionUID = 1L;

	public MovieNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MovieNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MovieNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MovieNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
