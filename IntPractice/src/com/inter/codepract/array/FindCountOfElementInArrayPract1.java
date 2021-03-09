package com.inter.codepract.array;

public class FindCountOfElementInArrayPract1 {

	static void findCount(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int B[] = new int[max+1];
		for(int i=0;i<arr.length;i++) {
			B[arr[i]]++;
		}
		
		for(int i=0;i<B.length;i++) {
			if(B[i]>0) {
				System.out.println("count of "+ i + " is "+ B[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,1,3,4,4,5,6,6};
		findCount(arr);
	}
}
