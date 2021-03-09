package com.inter.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};  
        int key = 50;  
        int last=arr.length-1;  
        int result = searchBinary(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  

	}

	static int searchBinary(int arr[],int first,int last,int key) {
		if(last>=first) {
			int mid = (first+last)/2;
			if(arr[mid]==key) {
				System.out.println(key +"is at pos "+ mid);
				return mid;
			}
			if(key<arr[mid]) {
				return searchBinary(arr, first, mid-1, key);
			}else {
				return searchBinary(arr, mid+1, last, key);
			}
			
		}
		return -1;
	}
}
