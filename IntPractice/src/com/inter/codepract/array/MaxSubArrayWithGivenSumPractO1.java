package com.inter.codepract.array;

import java.util.HashMap;

public class MaxSubArrayWithGivenSumPractO1 {

	public static int maxSubArrayLen(int[] arr, int k) {
		//sum and index
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int result = 0;
		map.put(0,-1);
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
			int leftOver = sum-k;
			if(map.get(leftOver) != null) {
				result = Math.max(result,i-map.get(leftOver));
			}else {
				map.put(sum,i);
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4};
		System.out.println(maxSubArrayLen(arr,5));
	}
}
