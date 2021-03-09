package com.inter.codepract.array;

import java.util.Arrays;

public class MaximumTriplerInArrayPract {

	static int maxProdctTriplet(int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		return Math.max(arr[0]*arr[1]*arr[n-1], arr[n-2]*arr[n-1]*arr[n-3]);
	}
	
	public static void main(String[] args) {
		int arr[] = { -2,-3,-1,-5,-6 };
		System.out.println(maxProdctTriplet(arr));
	}
}
