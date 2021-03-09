package com.inter.quick;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        quickSort(arr, 0, n-1); 
  
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
	static void quickSort(int arr[],int low,int high) {
		if(low<high) {
		 int part = partition(arr, low, high);
		 quickSort(arr, low, part-1);
		 quickSort(arr, part+1, high);
		}
	}
	
	static int partition(int arr[],int low, int high) {
		int pivot = arr[high];
		int index = low-1;
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
