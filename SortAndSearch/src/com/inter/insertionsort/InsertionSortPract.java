
package com.inter.insertionsort;

public class InsertionSortPract {

	static void sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = new int[] {12,11,17,6,1,5,10};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}