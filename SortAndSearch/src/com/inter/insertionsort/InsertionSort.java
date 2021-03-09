package com.inter.insertionsort;

public class InsertionSort {
 
	public static void main(String[] args) {
		int arr[] = new int[] {12,11,17,6,1,5,10};
		sortAsInserted(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static void sortAsInserted(int arr[]) {
		int lngth  = arr.length;
		for(int i=1;i<lngth;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
