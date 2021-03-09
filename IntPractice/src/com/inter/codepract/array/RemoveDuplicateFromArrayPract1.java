package com.inter.codepract.array;

import java.util.Arrays;

public class RemoveDuplicateFromArrayPract1 {

	static int removeDup(int arr[]) {
		Arrays.sort(arr);
		int i=0;
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j] != arr[j+1]) {
				arr[i] = arr[j];
				i++;
			}
		}
		arr[i++] = arr[arr.length-1];
		return i;
	}
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,1,5,6,6};
		int i= removeDup(arr);
		for(int j=0;j<i;j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
