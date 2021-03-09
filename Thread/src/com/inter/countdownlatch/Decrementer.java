package com.inter.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable {

	CountDownLatch latch;

	public Decrementer(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			System.out.println("dec");
			Thread.sleep(1000);
			latch.countDown();
			
			Thread.sleep(1000);
			latch.countDown();
			
			Thread.sleep(1000);
			latch.countDown();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
