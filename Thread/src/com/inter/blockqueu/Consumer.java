package com.inter.blockqueu;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> qu;
	
	public Consumer(BlockingQueue qu) {
		this.qu = qu;
	}

	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consumed: " + qu.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}