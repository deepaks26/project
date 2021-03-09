package com.inter.design.chainofresp;

public class CORApp {

	public static void main(String[] args) {
		FileLogger file = new FileLogger(AbstractLogger.INFO);
		ErrorLogger error = new ErrorLogger(AbstractLogger.ERROR);
		error.setNextLogger(file);
		
		error.logMsg(AbstractLogger.INFO, "file logger");
	}
}
