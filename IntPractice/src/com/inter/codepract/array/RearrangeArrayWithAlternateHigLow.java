package com.inter.codepract.array;

public class RearrangeArrayWithAlternateHigLow {

	static void alter(int arr[]) {
		int i=0;
		int j=1;
		
		while(j<arr.length) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(j+1<arr.length && arr[j]<arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			i=j+1;
			j=j+2;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
		alter(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
