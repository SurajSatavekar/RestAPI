package com.example.RestAPI_demo.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExceptionHandler {

	
	 @ExceptionHandler(EmpNotFoundException.class)
	    public ResponseEntity<ErrorResponse> handleEmpNotFoundException(EmpNotFoundException ex) {
	        ErrorResponse errorResponse = new ErrorResponse(
	            LocalDateTime.now(),
	            ex.getMessage(),
	            "Employee not found"
	        );
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	    }}
