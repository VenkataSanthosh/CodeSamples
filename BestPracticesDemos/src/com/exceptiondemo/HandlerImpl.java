package com.exceptiondemo;

public class HandlerImpl implements Handler {
	@Override
	public void handle(CustomFileNotFoundException cfe) {
		System.out.println(cfe);
	}
}
