package com.example.JavaRestMicroCICDKuberDocker.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class MovieExceptionHandler {

	@ExceptionHandler(value = {MovieNotFoundException.class})
	public ResponseEntity<Object> handleMovieNotFoundException(MovieNotFoundException mnfe) {
		MovieException movieException = new MovieException(mnfe.getMessage(), mnfe.getCause(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(movieException, HttpStatus.NOT_FOUND);
	}
}
