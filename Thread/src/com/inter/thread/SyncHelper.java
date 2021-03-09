package com.inter.thread;

public class SyncHelper {

	public synchronized  static void printNumber() {
			for(int i= 0;i<3;i++) {
			/*
			 * try { wait(); } catch (InterruptedException e) { // TODO Auto-generated catch
			 * block e.printStackTrace(); }
			 */
				System.out.println(Thread.currentThread().getName() +" " +i);
			}
	}
}
