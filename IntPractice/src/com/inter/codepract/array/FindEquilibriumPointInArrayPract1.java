package com.inter.codepract.array;

public class FindEquilibriumPointInArrayPract1 {

	static void findEqPoint(int arr[]) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		int leftSum =0;
		for(int i=0;i<arr.length;i++) {
			leftSum = leftSum+arr[i];
			if(leftSum==sum) {
				System.out.println("eq point " + arr[i]);
				break;
			}
			sum-=arr[i];
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {4,3,2,2};
		findEqPoint(arr);
	}
}
