package com.inter.codepract.array;

public class MaxSubArrayWithHighestSumPract {

	static int maxSubArrayWithHighestSum(int arr[]) {
		int maxEndingHere = 0; // continous sum
		int maxSoFar = 0;// output
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxEndingHere + arr[i]) {
				maxEndingHere = arr[i];
				start = i;
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
		System.out.println("Maximum contiguous sum is " + maxSubArrayWithHighestSum(a));
	}
}
