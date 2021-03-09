package com.inter.codepract.array;

public class MaxSubArrayWithHighestProductPract1On {

	static int maxProduct(int[] arr) {
		int max[] = new int[arr.length];
		int min[] = new int[arr.length];

		max[0] = min[0] = arr[0];
		int result = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > 0) {
				max[i] = Math.max(arr[i], max[i - 1] * arr[i]);
				min[i] = Math.min(arr[i], min[i - 1] * arr[i]);
			} else {
				max[i] = Math.max(arr[i], min[i - 1] * arr[i]);
				min[i] = Math.min(arr[i], max[i - 1] * arr[i]);
			}
			result = Math.max(result, max[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = new int[] {2,3,-2,4};
		System.out.println(maxProduct(arr));
	}
}
