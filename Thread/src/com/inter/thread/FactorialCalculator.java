package com.inter.thread;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {

	private int number;

	public FactorialCalculator(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		int result = 1;
		if (number == 1 || number == 0) {
			return 1;
		} else {
			for (int i = 2; i < number; i++) {
				result = result * i;
			}
		}
		return result;

	}

}
