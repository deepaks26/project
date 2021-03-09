package com.inter.merge;

public class FindPairWithGivenSum {

	public void sort(int arr[],int l,int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}

	public  void merge(int[] arr, int l, int m, int r) {
		int n1 = (m-l)+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i] = arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			R[j] = arr[m+1+j];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j < n2) {
			if(L[i]<R[j]) {
				arr[k] = L[i];
				i++;
				k++;
			}else {
				arr[k] = R[j];
				j++;
				k++;
			}
		}
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	void findPairWithSum(int arr[], int sum){
		sort(arr,0,arr.length-1);
		int low=0;
		int high = arr.length-1;
		while(low<high) {
			if(arr[low]+arr[high]==sum) {
				System.out.println("pair found -> " + arr[low] +" and " +arr[high]);
				return;
			}
			
			if(arr[low]+arr[high]>sum) {
					high--;
			}else {
				low++;
			}
		}
		System.out.println("Pair not found");
		
	}
	
	public static void main(String[] args) {
		int[] A = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        FindPairWithGivenSum f = new FindPairWithGivenSum();
        f.findPairWithSum(A, sum);
	}
	
}
