package com.inter.codepract.array;

public class FindFirstThreeLargestELementInArray {

	public static void main(String[] args) {
		int arr[] = new int[] {10,20,50,70,40,60};
		findFisrThreeLargestELemInArray(arr);
	}
	
	static void findFisrThreeLargestELemInArray(int arr[]){
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				third =second;
				second = first;
				first= arr[i];
			}else if(arr[i]>second) {
				third = second;
				second = arr[i];
			}else if(arr[i]>third) {
				third = arr[i];
			}
		}
		
		System.out.println("first -> "+ first+ " second -> " +second + " third -> "+third);
	}
}
