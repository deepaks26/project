package com.inter.binarysearch;

public class BinSearchPract {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};  
        int key = 50;  
        int last=arr.length-1;  
        int result = binSearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  

	}
	static int binSearch(int arr[],int l, int r,int key) {
		if(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key<arr[mid]) {
				return binSearch(arr, l, mid-1, key);
			}
			return binSearch(arr, mid+1, r, key);
			
		}
		return -1;
	}
}
