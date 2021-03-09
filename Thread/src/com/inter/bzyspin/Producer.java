package com.inter.bzyspin;

import java.util.ArrayList;

public class Producer implements Runnable {

	ArrayList<Integer> list ;
	boolean isInProgress;

	public Producer() {
		list = new ArrayList<Integer>();
		isInProgress = true;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			list.add(i);
			System.out.println("Producer is still Producing, Produced : " + i);
		}
		isInProgress = false;
	}

}
