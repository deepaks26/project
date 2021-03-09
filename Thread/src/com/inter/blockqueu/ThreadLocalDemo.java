package com.inter.blockqueu;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		LocalThread td = new LocalThread();
		Thread t1 = new Thread(td);
		Thread t2 = new Thread(td);
		
		t1.start();
		t2.start();

	}

	public static class LocalThread implements Runnable{
		ThreadLocal<Integer> intg = new ThreadLocal<Integer>();

		@Override
		public void run() {
			intg.set((int)(Math.random()*1000));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(intg.get());
		}
		
	}
}
