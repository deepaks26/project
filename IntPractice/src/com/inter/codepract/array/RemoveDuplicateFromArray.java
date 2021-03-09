package com.inter.codepract.array;

import java.util.Arrays;
import java.util.Optional;

public class RemoveDuplicateFromArray {

	public static int removeDuplicates(int a[]) {
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!= a[i+1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[a.length-1];
		return j;
	} 
	
	public static void main(String[] args) 
    { 
		
		
        int a[] = {1,1,2,2}; 
  Optional.ofNullable(null);
        int j=0; 
        
        // the function will modify th  e array a[] 
        // such that the starting j elements  
        // will be having all unique elements  
        // and no element will be apearing more than 
        // once 
        j = removeDuplicates(a); 
  
        // printing array elements 
        for (int i = 0; i < j; i++) 
            System.out.print(a[i] + " "); 
    } 
}
