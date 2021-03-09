package com.inter.thread;

public class ExecutorTask implements Runnable {
	private String name;

	public ExecutorTask(String s) {
		name = s;
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(name+" " + i);
		}
	}


}
