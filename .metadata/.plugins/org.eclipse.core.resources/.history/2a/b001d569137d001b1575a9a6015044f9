package com.inter.thread;

public class PCDemo {

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer pc = new ProducerConsumer();
		
		Runnable run1 = () -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable run2 = () -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		//alternate way to create thread
		Thread t1 =  new Thread(() ->{
			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 =  new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}) ;
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
