package com.inter.codepract.array;

import java.util.Arrays;

public class FindPairWithGivenDiff {

	static boolean findPair(int arr[],int n) {
		Arrays.sort(arr);
		int size = arr.length;
		int i=0;
		int j=1;
		while(i<size && j<size) {
			if(i != j && arr[j]-arr[i]==n) {
				return true;
			}else if(arr[j]-arr[i]>n) {
				i++;
			}else {
				j++;
			}
		}
		return false;
	}
	
	
	boolean findDif(int arr[],int diff){
		Arrays.sort(arr);
		int i=0;
		int j=1;
		int size = arr.length;
		while(i<size && j<size) {
			if(arr[j]-arr[i]==diff) {
				return true;
			}else if(arr[j]-arr[i]>diff) {
				i++;
			}else {
				j++;
			}
		}
		return false;
	}
	public static void main (String[] args) 
    { 
        int arr[] = {1, 8, 30, 40, 100}; 
        int n = 60; 
       System.out.println(findPair(arr,n)); 
    } 
}
