package com.inter.codepract.array;

import java.util.Arrays;

public class MaxProductWithTwoIntegerPract1 {

	static int findMaxWithTwo(int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		return Math.max(arr[0]* arr[1],arr[n-1]*arr[n-2]);
	}
	
	public static void main(String[] args) {
		int[] A = { -10, -3, 5, 6, -20 };
		System.out.println(findMaxWithTwo(A));
	}
}
