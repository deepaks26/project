package com.inter.bzyspin;

public class OddEvenThread {

	public static void main(String[] args) {
		OddEvenThread od = new OddEvenThread();
		Thread t1 = new Thread(() ->  {
			try {
				od.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.setName("Odd");
		Thread t2 = new Thread(() ->  {
			try {
				od.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t2.setName("Even");
		t1.start();
		t2.start();

	}

	int N=10;
	int counter;
	
	synchronized void printEven() throws InterruptedException {
		while(counter <= N) {
			while(counter%2==0) {
				wait();
			}
			System.out.print(Thread.currentThread().getName() + counter + " ");
			counter++;
			notify();
		}
	}
	
	synchronized void printOdd() throws InterruptedException {
		while(counter <= N) {
			while(counter%2==1) {
				wait();
			}
			System.out.print(Thread.currentThread().getName() + counter + " ");
			counter++;
			notify();
		}
	}
}
