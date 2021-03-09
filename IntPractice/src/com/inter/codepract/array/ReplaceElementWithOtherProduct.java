package com.inter.codepract.array;

public class ReplaceElementWithOtherProduct {

	static void ReplaceElements(int arr[], int n)
	{
	    int prod = 1;
	     int left[] = new int[arr.length];
	     int right[] = new int[arr.length];
	      // Get the products below the current index
	    for(int i=0;i<n;++i) {
	    	left[i] = prod;
	    	prod = prod*arr[i];
	      
	    }
	 
	    // Get the products above the curent index
	    prod=1;
	    for(int i=n-1;i>=0;--i) {
	      right[i] = prod;
	      prod*=arr[i];
	    }
	    
	    for(int i=0;i<n;++i) {
	    	arr[i] = left[i]*right[i];
	    }
	}
	 
	public static void main(String[] args)
	{
	    int arr[] = { 2, 3, 3, 5, 7 };
	    int n = arr.length;
	 
	    ReplaceElements(arr, n);
	 
	    // Print the modified array.
	    for (int i = 0; i < n; ++i) {
	        System.out.print(arr[i]+" ");
	    }
	 
	}
}
