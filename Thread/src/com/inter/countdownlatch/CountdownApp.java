package com.inter.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountdownApp {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		Thread t1 = new Thread(new Waiter(latch));
		Thread t2 = new Thread(new Decrementer(latch));
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
