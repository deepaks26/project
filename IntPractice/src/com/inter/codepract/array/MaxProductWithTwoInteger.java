package com.inter.codepract.array;

import java.util.Arrays;

public class MaxProductWithTwoInteger {

	static int findMaxTwoInetegerProduct(int arr[]) {
		int n = arr.length;
		Arrays.sort(arr);
		return Math.max(arr[0] * arr[1], arr[n - 1] * arr[n - 2]);
	}

	public static void main(String[] args) {
		int[] A = { -10, -3, 5, 6, -20 };
		System.out.println(findMaxTwoInetegerProduct(A));
	}
}
