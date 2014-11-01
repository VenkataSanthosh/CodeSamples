package com.exceptiondemo;

public class CustomFileNotFoundException extends CustomException {
	
	private static final long serialVersionUID = 1L;
	String message;
	public CustomFileNotFoundException(String message) {
		this.message = message;
	}
	@Override
	public void toVisit() {
		new HandlerImpl().handle(this);
	}
	@Override
	public String toString() {
		return message;
	}
}
