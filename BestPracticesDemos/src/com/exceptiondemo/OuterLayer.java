package com.exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

public class OuterLayer {

	public static Logger logger = Logger.getLogger("OuterLayer");

	public static Acknowledgement testException(String number)throws CustomException {
		Acknowledgement ack = new Acknowledgement();
		
		try {
			ack = MiddleLayer .testException(number);
			logger.info(ack.getMessage());

		} catch (FileNotFoundException e) {
			logger.severe("FileNotFoundException occurs" + e);
			throw new CustomFileNotFoundException("Custom FileNotFoundException ");
		} catch (IOException e) {
			logger.severe("IOException occurs" + e);
		} finally {
			logger.info("Releasing resources");
		}
		return ack;
	}
}
