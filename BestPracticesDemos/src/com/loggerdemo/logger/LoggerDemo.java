package com.loggerdemo.logger;

import java.text.MessageFormat;
import java.util.logging.Logger;

import com.loggerdemo.loggerconstants.LoggerConstants;

public class LoggerDemo {

	public static Logger logger = Logger.getLogger(LoggerDemo.class.getName());
	public static void main(String[] args) {
		logger.entering("LoggerDemo", "MainMethod");
		logger.info(LoggerConstants.APP_CONSTANTS_BUNDLE
		.getString("TEST001E"));
		logger.info(MessageFormat.format(
				LoggerConstants.APP_CONSTANTS_BUNDLE.getString("TEST001E"),
				logger));
		logger.exiting("LoggerDemo", "Main Method");
	}
}
