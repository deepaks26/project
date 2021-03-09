package com.inter.codepract.array;

public class SortBinaryArray {

	public static void main(String[] args) {
		int arr[] = new int[] {0,0,1,1,0,1};
		sortBinArray(arr);
		for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
	}
	static void sortBinArray(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<1) {
				int temp = arr[j];
				arr[j] =arr[i];
				arr[i] = temp;
				j++;
			}
		}
	}
}
