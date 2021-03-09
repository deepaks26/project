package com.inter.codepract.array;

public class FindFirstThreeLargestELementInArrayPract1 {

	static void findFirstThreeLargestELm(int arr[]) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				third = second;
				second = first;
				first = arr[i];
			}else if(arr[i]>second) {
				third = second;
				second = arr[i];
			}else if(arr[i]>third) {
				third = arr[i];
			}
		}
		
		System.out.println(first +" " + second + " " + third);
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {4,2,1,3,5};
		findFirstThreeLargestELm(arr);
	}
}
