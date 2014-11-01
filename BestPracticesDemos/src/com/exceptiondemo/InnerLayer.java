package com.exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InnerLayer {
	
	public static Acknowledgement testException(int i) throws FileNotFoundException,
			IOException {
		//if exception occurs it will create object and check for handler
		//if there is any  breaks business flow always throws exception to outerlayer 
		//it it is not breaking handle it here itself
		//handling is nothing but catching it
		//A->B->C  it will check for handler in C->B->A
		
		if (i < 0) {
			FileNotFoundException myException = new FileNotFoundException(
					"Negative Integer " + i);
			throw myException;
		} else if (i > 10) {
			throw new IOException("Only supported for index 0 to 10");
		}

		Acknowledgement ack = new Acknowledgement();
		ack.setFlag(true);
		ack.setMessage("success");
		return ack;
	}
	
}
