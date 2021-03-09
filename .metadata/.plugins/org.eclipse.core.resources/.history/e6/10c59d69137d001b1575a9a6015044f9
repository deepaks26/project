package com.inter.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorDemo {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		pool.execute(new ExecutorTask("A"));
		pool.execute(new ExecutorTask("B"));
		pool.execute(new ExecutorTask("C"));
		 pool.shutdown();  
	}
}
