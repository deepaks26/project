package com.inter.bubble;

public class BubbleSortPract {

	static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
					if(arr[j]<arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1]  =temp;
					}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 1, 3 , 5, 7,4,10,56,32};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
