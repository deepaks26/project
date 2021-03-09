package com.inter.codepract.array;

import java.util.Arrays;

public class FindTripletWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int sum = 6;

		findTriplet(arr, sum);
	}

	static void findTriplet(int arr[], int sum) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int k = sum - arr[i];
			int low = i + 1;
			int high = arr.length - 1;
			while (low < high) {
				if (arr[low] + arr[high] > k) {
					high--;
				} else if (arr[low] + arr[high] < k) {
					low++;
				} else {
					System.out.println("(" + arr[i] + ", " + arr[low] + ", " + arr[high] + ")");
					low++;
					high--;
				}
			}
		}
	}
}
