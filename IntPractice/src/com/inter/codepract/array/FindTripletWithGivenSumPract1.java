package com.inter.codepract.array;

import java.util.Arrays;

public class FindTripletWithGivenSumPract1 {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int sum = 6;
		findTrip(arr, sum);
	}
	static void findTrip(int arr[], int sum) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int left = sum-arr[i];
			int low = i+1;
			int high = arr.length-1;
			while(low<high) {
				if(arr[low]+arr[high]==left) {
					System.out.println("triplet "+arr[i]+" "+arr[low]+ " "+arr[high]);
					low++;
					high--;
				}else if(arr[low]+arr[high]>left) {
					high--;
				}else {
					low++;
				}
			}
		}
	}
}
