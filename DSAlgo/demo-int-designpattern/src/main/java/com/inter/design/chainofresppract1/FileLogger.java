package com.inter.design.chainofresppract1;

public class FileLogger extends AbstractLogger{

	@Override
	protected void write(String msg) {
		System.out.println("file logger -> "+ msg);
		
	}

}
