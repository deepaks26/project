package com.inter.merge;

public class MergeSort {

	static void sort(int arr[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			sort(arr, beg, mid);
			sort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}

	static void merge(int arr[], int beg, int mid, int end) {
		int left = mid - beg + 1;
		int right = end - mid;

		int leftArr[] = new int[left];
		int rightArr[] = new int[right];

		for (int i = 0; i < left; i++) {
			leftArr[i] = arr[beg + i];
		}

		for (int j = 0; j < right; j++) {
			rightArr[j] = arr[mid+1 + j];
		}

		int i = 0;
		int j = 0;
		int k = beg;
		while (i < left && j < right) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < left) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < right) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1 };
		sort(arr, 0, arr.length - 1);
		System.out.println("\nSorted array");
		printArray(arr);
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
