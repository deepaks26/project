package com.inter.design.chainofresppract2;

public class App {

	public static void main(String[] args) {
		FileLogger fLogger = new FileLogger();
		fLogger.level = 2;
		ErrorLogger eLogger  = new ErrorLogger();
		eLogger.level = 1;
		fLogger.nextLogger = eLogger;
		fLogger.log(1, "Error occuered");
	}
}
