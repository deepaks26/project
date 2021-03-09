package com.inter.design.chainofresppract2;

public class FileLogger extends AbstractLogger {

	@Override
	protected void write(String message) {
		System.out.println("FILE_LOG -> "+ message);
	}

}
