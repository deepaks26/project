package com.inter.codepract.array;

public class FIndMInMaxUnsortedArray {

	public static void main(String[] args) {
		int arr[] = new int[] {3,2,4,5,10,-1,11,45,-2};
		minMax(arr);
	}
	static void findMinMax(int arr[]){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("min - "+ min);
		System.out.println("max - "+ max);
		
	}
	
	static void minMax(int arr[]) {
		int min = Integer.MAX_VALUE;
		int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("min " + min);
		System.out.println("max " + max);
	}
}
