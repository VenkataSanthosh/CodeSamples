package com.exceptiondemo;

public abstract class CustomException extends Exception{

	private static final long serialVersionUID = 1L;
	/*String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public CustomException(String message){
		this.message = message;
	}
	@Override
	public String toString() {
		return message;
	}*/
	public abstract void toVisit();
	
}
