package com.inter.codepract.array;

public class FindDuplicatePract {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 1, 2 };
		findDupInArray(arr);
	}

	static void findDupInArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int j = Math.abs(arr[i]);
			if (arr[j] > 0) {
				arr[j] = -arr[j];
			} else {
				System.out.println("dup -> " + j);
			}
		}
	}
}
