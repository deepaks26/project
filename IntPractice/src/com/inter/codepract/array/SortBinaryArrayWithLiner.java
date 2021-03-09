package com.inter.codepract.array;

public class SortBinaryArrayWithLiner {

	public static void main(String[] args) {
		int arr[] = new int[] {1,0,0,1,0};
		sortBinaryArray(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
	}
	static void sortBinaryArray(int arr[]){
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<1) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
	}
}
