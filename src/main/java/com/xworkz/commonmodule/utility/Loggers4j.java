package com.xworkz.commonmodule.utility;

import org.apache.log4j.Logger;

public class Loggers4j {
	static Logger logger;

	static {
		logger = Logger.getLogger(Loggers4j.class);// using class
		// or
//		logger = Logger.getLogger("Loggers4j"); //using string
	}

	private static void demo() {
		logger.debug("Welcome");
	}

	public static void main(String[] args) {
		logger.debug("hello");
		demo();

	}
}
