//package com.example.JavaRestMicroCICDKuberDocker.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import lombok.extern.slf4j.Slf4j;
//
//@ControllerAdvice
//@Slf4j
//public class GlobalExceptionHandler {
//
//	static class Error{
//		
//		private final String reason;
//		private final String message;
//		
//		public Error(String reason, String message) {
//			super();
//			this.reason = reason;
//			this.message = message;
//		}
//	}
//	
//	@ExceptionHandler(IdNotFoundException.class)
//	@ResponseBody   //eeeee exception vachinappudu mana http request ki respond avvali andhuke idhi isthunnam
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	public Error handleIdNotFoundException(IdNotFoundException ex) {
//		log.warn(ex.getMessage());
//		return new Error(HttpStatus.BAD_REQUEST.getReasonPhrase(), ex.getMessage());
//	}
//	
//	//this is for unknown exceptions or defauls exceptions
//	@ExceptionHandler(Exception.class)
//	@ResponseBody   //eeeee exception vachinappudu mana http request ki respond avvali andhuke idhi isthunnam
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	public Error handleUnKnownException(IdNotFoundException ex) {
//		log.error(ex.getMessage());
//		return new Error(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), ex.getMessage());
//	}
//}
