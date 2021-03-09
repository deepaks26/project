package com.inter.codepract.array;

public class LittleSequence {

	public static void main(String[] args) {
		System.out.println(findSequence(10));
	}

	static int findSequence(int n) {
		int startSmall = 5;
		int startBig = 100;

		for (int i = 0; i < n; i++) {
			if (i != 0 && i != 1) {
				if (i % 2 == 0) {
					startSmall = startSmall + 1;
				} else {
					startBig = startBig * 2;
				}
			}
		}

		if (n % 2 == 0) {
			return startBig;
		} else {
			return startSmall;
		}
	}
}
