package com.inter.design.chainofresppract1;

public class ErrorLog extends AbstractLogger {

	@Override
	protected void write(String msg) {
System.out.println("Error log -> "+ msg);
	}

}
