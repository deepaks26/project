package com.inter.blockqueu;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> qu;
	
	public Producer(BlockingQueue qu) {
		this.qu = qu;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Produced: " + i);
				qu.put(i);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
