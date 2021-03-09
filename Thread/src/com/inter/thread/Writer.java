package com.inter.thread;

import java.util.Random;

public class Writer extends Thread {
	ReadWriteList<Integer> readWriteList;

	public Writer(ReadWriteList<Integer> readWriteList) {
		this.readWriteList = readWriteList;
	}

	public void run() {

		Random r = new Random();
		int number = r.nextInt(100);
		readWriteList.add(number);
		try {
			Thread.sleep(100);
			System.out.println(getName() + " -> put: " + number);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
