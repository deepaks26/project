package com.inter.maxsubarry;

public class MergeTwoArray {

	int[] merge(int arr1[],int arr2[],int n1,int n2) {
		
		int i=0;
		int j = 0;
		int k = 0;
		int arr3[] = new int[n1+n2];
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				arr3[k++] = arr1[i++];
			}else {
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i<n1) {
			arr3[k++] = arr1[i++];
		}
		
		while(j<n2) {
			arr3[k++] = arr2[j++];
		}
		
		return arr3;
	}
}
