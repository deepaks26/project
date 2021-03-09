package com.inter.quick;

public class QuickSortPract {

	public static void main(String[] args) {
		int arr[] = new int[] {1,12,10,5,6,9};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pivot = patition(arr,low,high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}

	private static int patition(int[] arr, int low, int high) {
		int index = low-1;
		int pivot = arr[high];
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				index++;
				int temp = arr[index];
				arr[index] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[index+1];
		arr[index+1] = arr[high];
		arr[high] = temp;
		return index+1;
	}
}
