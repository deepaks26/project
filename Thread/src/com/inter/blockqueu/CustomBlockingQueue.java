package com.inter.blockqueu;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBlockingQueue {

	int arr[] = new int[10];
	Lock lock = new ReentrantLock();
	Condition prodCon = lock.newCondition();
	Condition consCon = lock.newCondition();
	
	int count;
	int putIndex;
	int takeIndex;
	public void put(int key) throws InterruptedException {
		lock.lock();
		try {
			if(count==arr.length) {
				prodCon.await();
			}
			arr[putIndex]= key;
			count++;
			putIndex++;
			consCon.signal();
		}finally {
			lock.unlock();
		}
	}
	
	public int take() throws InterruptedException {
		lock.lock();
		try {
			if(count==0) {
				consCon.await();
			}
			int elm = arr[takeIndex];
			count--;
			takeIndex++;
			return elm;
			
		}finally {
			lock.unlock();
		}
	}
	
	
}
