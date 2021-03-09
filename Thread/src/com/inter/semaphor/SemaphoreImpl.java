package com.inter.semaphor;

import java.util.concurrent.Semaphore;

public class SemaphoreImpl {

}

class MyThread extends Thread {

	Semaphore sem;
	String name;

	public MyThread(Semaphore sem, String name) {
		this.sem = sem;
		this.name = name;
	}

	public void run() {
		if (name.equals("A")) {

			try {
				sem.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 5; i++) {
				Shared.count++;
				System.out.println("name - " + name + "- " + Shared.count);
			}
			System.out.println(name + " released");
			sem.release();
		} else {

			try {
				sem.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 5; i++) {
				Shared.count--;
				System.out.println("name - " + name + "- " + Shared.count);
			}
			System.out.println(name + " released");
			sem.release();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Semaphore sem = new Semaphore(1);
		MyThread t1 = new MyThread(sem, "A");
		MyThread t2 = new MyThread(sem, "B");

		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}
}

class Shared {
	static int count = 0;
}
