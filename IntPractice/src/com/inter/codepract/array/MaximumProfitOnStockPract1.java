package com.inter.codepract.array;

public class MaximumProfitOnStockPract1 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 2, 3, 6, 4, 5, 10 };
		System.out.println(maxProf(arr));
	}
	
	static int maxProf(int arr[]) {
		int i=0;
		int recentMax = arr[0];
		int profit = 0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j]>recentMax) {
				recentMax = arr[j];
				if(j==arr.length-1) {
					profit += (recentMax - arr[i]);
				}
			}else {
				profit += (recentMax - arr[i]);
				i = j;
				recentMax=arr[j];
			}
		}
		return profit;
	}
}
