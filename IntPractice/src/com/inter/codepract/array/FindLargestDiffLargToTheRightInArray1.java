package com.inter.codepract.array;

public class FindLargestDiffLargToTheRightInArray1 {

	static int findLargestDiffLargToTheRightInArray(int arr[]) {
		int maxDiff = arr[1]-arr[0];
		int minEl = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-minEl>maxDiff) {
				maxDiff = arr[i]-minEl;
			}
			if(arr[i]<minEl) {
				minEl=arr[i];
			}
		}
		return maxDiff;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {4,2,3,7,10,5,6,9,1};
		System.out.println(findLargestDiffLargToTheRightInArray(arr));
	}
}
