package com.exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

public class MiddleLayer {
	public static Logger logger = Logger.getLogger(MiddleLayer.class.getName());
	public static final String realNumber="-?\\d+(\\.\\d+)?";

	public static Acknowledgement testException(String number)
			throws FileNotFoundException, IOException {
		Acknowledgement ack = new Acknowledgement();
		if (!number.matches(realNumber)) {
			ack.setFlag(false);
			ack.setMessage("Failure ");
		} else {
			try {
				ack = InnerLayer.testException(Integer.parseInt(number));
			} catch (NumberFormatException e) {
				logger.info("number format");
			}
		}
		return ack;
	}
}
