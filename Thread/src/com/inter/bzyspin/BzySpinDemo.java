package com.inter.bzyspin;

public class BzySpinDemo {

	public static void main(String[] args) {

		Producer prd = new Producer();
		Consumer cn = new Consumer(prd);
		Thread t1 = new Thread(prd);
		Thread t2 = new Thread(cn);

		t1.start();
		t2.start();

		System.out.println(m());

	}

	static int m() {
		try {
			return 1;

		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

}