package com.inter.negatearray;

public class PosAndNegArray {

	public static void main(String[] args) {
		int arr[] = new int[] {3, -9, 5, -1, 2, 6, 7, -10, -12};
		int posarr[]  = new int[arr.length];
		int negarr[]  = new int[arr.length];
		int negIndex = 0;
		int postIndex = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<0) {
				negarr[negIndex] = arr[i];
				negIndex++;
			}else {
				posarr[postIndex] = arr[i];
				postIndex++;
			}
		}
		for(int i = 0; i<arr.length;i++) {
			if(negIndex<negarr.length) {
				negarr[negIndex] = posarr[i];
				negIndex++;
			}
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print(negarr[i] + " ");
		}
	}
}
