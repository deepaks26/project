package com.inter.merge;

public class MergeSortPract1 {

	static void sort(int arr[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int n1 = (mid - low) + 1;
		int n2 = high - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i] = arr[low + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = arr[mid + i + 1];
		}

		int i = 0;
		int j = 0;
		int k = low;
		while (i < n1 && j < n2) {
			if (L[i] < R[j]) {
				arr[k] = L[i];
				i++;
				k++;
			} else {
				arr[k] = R[j];
				k++;
				j++;
			}
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1,12,8,14,9 };

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