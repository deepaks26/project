package com.inter.codepract.array;

public class FindEquilibriumPoint {

	public static void main(String[] args) {
		int arr[] = new int[] { -1, 2, -3, 4, 3, 2, 0 };
		System.out.println(findEqiPoint(arr));
	}

	public static int findEqiPoint(int arr[]) {
		int rightSum = findSum(arr, arr.length - 1, 0);
		int leftSum = 0;
		for(int i=0;i<arr.length;i++) {
			leftSum=leftSum+arr[i];
			if(leftSum==rightSum) {
				return i;
			}
			rightSum-=arr[i];
		}
		return -1;
	}

	static int findSum(int arr[], int length, int sum) {
		if (length < 0) {
			return sum;
		}
		sum += arr[length];
		return findSum(arr, --length, sum);

	}
}
