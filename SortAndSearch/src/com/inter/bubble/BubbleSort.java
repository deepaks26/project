package com.inter.bubble;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 1, 3 , 5, 7,4,10,56,32};
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static void bubbleSort(int arr[]) {
		int ln = arr.length;
		for (int i = 0; i < ln; i++) {
			for (int j = 0; j < ln-1; j++) {
				if (arr[j] > arr[j+1]) {
					  int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp;
				}
			}
		}
	}
}
