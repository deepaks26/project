package com.inter.codepract.array;

public class MoveAllZeroToTheEnd {

	public static void main(String[] args) {
		int arr[] = new int[] {0,0,0,3,1};
		moveAllZeroToEnd(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static void moveAllZeroToEnd(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[j]==0 && arr[i]>0) {
				int temp= arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
				
	}
}
