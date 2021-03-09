package com.inter.thread;

import java.util.Random;

public class Reader extends Thread {

	ReadWriteList<Integer> readWriteList;

	public Reader(ReadWriteList<Integer> readWriteList) {
		this.readWriteList = readWriteList;
	}

	public void run() {
		Random random = new Random();
		int index = random.nextInt(readWriteList.size());
		Integer number = readWriteList.get(index);

		System.out.println(getName() + " -> get: " + number);

		try {
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
