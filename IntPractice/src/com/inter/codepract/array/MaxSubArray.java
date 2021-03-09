package com.inter.codepract.array;

public class MaxSubArray {

	static int findMaxSoFar(int arr[]) {
		int maxSoFar = 0; // output
		int maxEndingHere = 0; // continous max
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maxEndingHere+arr[i]) {
				start = i;
				maxEndingHere = arr[i];
			} else {
				maxEndingHere += arr[i];

			}

			if (maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
				end = i;
			}
		}

		return maxSoFar;
	}

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + findMaxSoFar(a));
	}
}
