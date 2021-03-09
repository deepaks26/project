package com.inter.thread;

public class UncaughtThread implements Runnable{

	public void run() {
		Thread.currentThread().setUncaughtExceptionHandler(new ThreadExceptionHandler());
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("ABC"));
		System.out.println(Integer.parseInt("456"));
	}
}
