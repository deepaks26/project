package com.inter.codepract.array;

public class FindLargestDiffLargToTheRightInArray {

	public static void main(String[] args) {
		int arr[] = new int[] {4,2,3,7,10,5,6,9,1};
		System.out.println(findLargestDiffWithLargeToTheRight(arr));
	}
	public static int findLargestDiffWithLargeToTheRight(int arr[]) {
		
		int maxDiff = arr[1]-arr[0];
		int minElem = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-minElem>maxDiff) {
				maxDiff = arr[i]-minElem;
			}
			if(arr[i]<minElem) {
				minElem=arr[i];
			}
		}
		return maxDiff;
	}
}
