package com.inter.merge;

public class MgSortPract {

	static void sort(int arr[],int l,int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i=0;i<n1;i++) {
			L[i] = arr[l+i];
		}
		
		for(int i=0;i<n2;i++) {
			R[i] = arr[m+i+1];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1&&j<n2) {
			if(L[i]<R[j]) {
				arr[k] = L[i];
				i++;
				k++;
			}else {
				arr[k] = R[j];
				k++;
				j++;
			}
		}
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {38,27,43,3,9,82,10};
		sort(arr, 0, 6);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
