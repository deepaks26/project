package com.inter.heapsort;

public class HeapSortPract2 {

	static void  heapSort(int arr[],int n) {
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr,i,0);
		}
	
	}

	private static void heapify(int[] arr, int n, int i) {
		int large = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && arr[left]>arr[large]) {
			large = left;
		}
		if(right<n && arr[right]>arr[large]) {
			large = right;
		}
		
		if(large!=i) {
			int temp = arr[i];
			arr[i] = arr[large];
			arr[large] = temp;
			heapify(arr, n, large);
					
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,12,9,5,6,10};
		heapSort(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print( arr[i] + " ");
		}
	}
}
