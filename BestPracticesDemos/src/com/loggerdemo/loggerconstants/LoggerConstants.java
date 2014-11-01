package com.loggerdemo.loggerconstants;

import java.util.ResourceBundle;

public class LoggerConstants {
	/**
	 * fully qualified name of the logger codes file
	 */
	private static final String BUNDLE_NAME="com.loggerdemo.loggerproperties.loggerCodes";
	/**
	 * resource bundle of the loggerCode property file
	 * USAGE: logger.severe(LoggerConstants.APP_CONSTANTS_BUNDLE.getString("AMSSI004E"));
	 */
	public static final ResourceBundle APP_CONSTANTS_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);
}
