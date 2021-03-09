package com.inter.codepract.array;

public class MaximumProfitOnStock {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 2, 3, 6, 4, 5, 10 };
		// int arr1[] = new int[] {10, 8, 6, 5, 4, 2};
		System.out.println(findMaxProfit(arr));
	}

	static int findMaxProfit(int arr[]) {
		int i = 0;
		int profit = 0;
		int recentMax = arr[0];
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > recentMax) {
				recentMax = arr[j];
				if (j == arr.length - 1) {
					profit += (recentMax - arr[i]);
				}
			} else {
				profit += (recentMax - arr[i]);
				recentMax = arr[j];
				i = j;
			}
		}

		return profit;
	}
}
