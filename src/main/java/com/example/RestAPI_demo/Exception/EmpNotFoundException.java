package com.example.RestAPI_demo.Exception;

public class EmpNotFoundException extends RuntimeException{

	public EmpNotFoundException(String msg) {
		super(msg);
	}
}
