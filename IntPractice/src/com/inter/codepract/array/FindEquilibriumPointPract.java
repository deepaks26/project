package com.inter.codepract.array;

import java.util.stream.IntStream;

public class FindEquilibriumPointPract {

	static int findEquiPoint(int arr[]) {
		int sum = IntStream.of(arr).sum();
		int leftSum = 0;
		for(int i=0;i<arr.length;i++) {
			leftSum +=arr[i];
			if(leftSum==sum) {
				return i;
			}
			sum-=arr[i];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] { -1, 2, -3, 4, 3, 2, 0 };
		System.out.println(findEquiPoint(arr));
	}
}
