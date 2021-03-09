package com.inter.codepract.array;

public class FindDupInArrayWithMathAbs {

	static void findDupUsingMathAbs(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int j = Math.abs(arr[i]);
			if(arr[j]>0) {
				arr[j]  =-arr[j];
			}else {
				System.out.println(Math.abs(arr[i]) +" is duplicate");
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,2,3,1};
		findDupUsingMathAbs(arr);
	}
}
