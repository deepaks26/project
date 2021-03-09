package com.inter.design.chainofresppract2;

public class ErrorLogger extends AbstractLogger {

	@Override
	protected void write(String message) {
		System.out.println("ERROR LOG -> " + message);
	}

}
