package com.inter.thread;

public class SyncDemo {
	public static void main(String[] args) throws InterruptedException {

		SyncHelper sync = new SyncHelper();
		SyncHelper sync1 = new SyncHelper();
		Runnable run = () -> {
			sync.printNumber();
		};

		Runnable run1 = () -> {
			sync1.printNumber();
		};

		Thread t1 = new Thread(run, "Thread1");
		Thread t2 = new Thread(run1, "Thread2");

		t1.start(); 
		t2.start(); 
		/*
		 * t1.join(); t2.join();
		 */
		/*
		 * DemoExtendThread dt = new DemoExtendThread(); DemoExtendThread dt1 = new
		 * DemoExtendThread(); dt.run(); dt1.run();
		 */
	}

}
