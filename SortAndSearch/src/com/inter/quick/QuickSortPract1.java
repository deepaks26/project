package com.inter.quick;

public class QuickSortPract1 {

	static void sort(int arr[],int low,int high) {
		if(low<high) {
			int pi = partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot =arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp  =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,12,10,5,6,9};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}
}