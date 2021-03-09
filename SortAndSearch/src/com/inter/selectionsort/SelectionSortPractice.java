package com.inter.selectionsort;

public class SelectionSortPractice {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 12, 9, 5, 6, 10 };
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
