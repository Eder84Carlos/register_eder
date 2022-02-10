package com.example.register_eder.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Ressource not found. Id " + id);
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
