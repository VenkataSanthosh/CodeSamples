package com.exceptiondemo;

public class UserLayer {

	public static void main(String[] args) {
		try {
			Acknowledgement ack =OuterLayer.testException("2");
			ack.getMessage();
		} catch (CustomException e) {
			e.toVisit();
		}
	}
}
