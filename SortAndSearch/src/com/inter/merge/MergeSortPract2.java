package com.inter.merge;

public class MergeSortPract2 {

	static void sort(int arr[],int low, int high) {
		if(low<high) {
			int mid = (high+low)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			merge(arr,low,mid,high);
			
		}
	}

	private static void merge(int arr[], int low, int mid, int high) {
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i] = arr[low+i];
		}
		for(int i=0;i<n2;i++) {
			R[i] = arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k = low;
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				arr[k]  = L[i];
				k++;
				i++;
			}else {
				arr[k] = R[j];
				j++;
				k++;
			}
		}
		
		while(i<n1) {
			arr[k] = L[i];
			k++;
			i++;
		}
		
		while(j<n2) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {38,27,43,3,9,82,10};
		sort(arr, 0, 6);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
