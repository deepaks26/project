package com.inter.codepract.array;

public class MoveAllZeroToTheEndPract1 {

	static void moveAllZeroToLeft(int arr[]) {
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
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,0,1,0,1,0};
		moveAllZeroToLeft(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
