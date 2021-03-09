package com.inter.binarysearch;

public class BinSearchPract1 {

	int search(int arr[],int low,int high, int key) {
		if(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				System.out.println(mid);
				return mid;
			}
			
			 if(key<arr[mid]) {
				 return search(arr, low, mid-1,  key);
			 }else {
				 return search(arr, mid+1,high,  key);
			 } 
		}
		return -1;
	}
}
