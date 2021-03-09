package com.inter.codepract.array;

public class FindPairWithGivenSumPract {

	static void findPairWithGivnSum(int arr[],int sum) {
		heapSort(arr, arr.length);
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
			if(arr[low] + arr[high]==sum) {
				System.out.println("pair with sum " + sum + " arr" + arr[low] + "," + arr[high]);
			}
			if(arr[low]+arr[high]>sum) {
				high--;
			}else {
				low++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] A = { 8, 7, 2, 5, 3, 5 };
        int sum = 10;
        findPairWithGivnSum(A, sum);
	
	}
	static void heapSort(int arr[],int n){
		for(int i= n/2 -1;i>=0;i--) {
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
		int large= i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<n && arr[left]>arr[large]) {
			large= left;
		}
		if(right<n && arr[right]>arr[large]) {
			large = right;
		}
		if(large != i) {
			int temp = arr[i];
			arr[i] = arr[large];
			arr[large] = temp;
			heapify(arr,n,large);
		}
	}
}
