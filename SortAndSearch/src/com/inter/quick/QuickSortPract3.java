package com.inter.quick;

public class QuickSortPract3 {

	static void sort(int arr[], int low, int high) {
		if (low < high) {
			int part = partition(arr, low, high);
			sort(arr, low, part - 1);
			sort(arr, part + 1, high);

		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int index = low-1;
		for(int i=low;i<high;i++) {
			if(arr[i]<pivot) {
				index++;
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[index+1];
		arr[index+1] = arr[high];
		arr[high] = temp;
		return index+1;
	}

	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}
