package com.inter.design.chainofresppract1;

public class App {

	public static void main(String[] args) {
		FileLogger logf = new FileLogger();
		logf.level = 1;
		
		ErrorLog loge = new ErrorLog();
		logf.level = 2;
		
		logf.setNextLogger(loge);
		
		logf.log(2, "loggg");
		
	}
}