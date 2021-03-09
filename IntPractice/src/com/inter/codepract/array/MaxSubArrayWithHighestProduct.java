package com.inter.codepract.array;

public class MaxSubArrayWithHighestProduct {

	public static int maxProduct(int[] A) {
		int maxEnd = 0;
		int minEnd = 0;
		int maxSoFar = 0;
		for (int i : A) {
			int temp = maxEnd;
			maxEnd = Math.max(i, Math.max(i * maxEnd, i * minEnd));
			minEnd = Math.min(i, Math.min(i * temp, i * minEnd));
			maxSoFar = Math.max(maxSoFar, maxEnd);
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int[] A = { 2, 3, -1, 4 };

		System.out.print("The maximum product of a subarray is " + maxProduct(A));
	}
}
