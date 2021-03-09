package com.inter.bzyspin;

public class Consumer implements Runnable{

	Producer producer ;
	public Consumer(Producer producer) {
		this.producer = producer;
	}
	@Override
	public void run() {
		while(producer.isInProgress) {
			System.out.println("Prod is in progress");
		}
		for(int i=0;i<producer.list.size();i++) {
			System.out.println("Consumed : "+ this.producer.list.remove(0) +" ");
		}
	}

}
