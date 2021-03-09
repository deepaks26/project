package com.inter.codepract.array;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,1,1,1,1,1,4,4,4,4,2,3,3,3};
		findDupe(arr);
	}
	static void findDupe(int arr[]){
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int B[] = new int[max+1];
		for(int j=0;j<arr.length;j++) {
			int el = arr[j];
			B[el]++;
			if(B[el]>1) {
				B[el] = B[el]-arr[j];
					System.out.println(arr[j]);
			}
		}
	}
	
	/*
	 * static void findDupe(int arr[]){ int j=0; for(int i=0;i<arr.length-1;i++) {
	 * 
	 * } }
	 */
}
