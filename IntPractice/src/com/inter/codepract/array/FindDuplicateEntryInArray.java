package com.inter.codepract.array;

public class FindDuplicateEntryInArray {
	void printRepeating(int arr[], int size)
    {
		
		for(int i=0;i<arr.length;i++) {
			int j = Math.abs(arr[i]);
			if(arr[j]>=0) {
				arr[j] = -arr[j];
			}else {
				System.out.println(Math.abs(arr[i]));
			}
			
		}
    }
 
    // Driver code
    public static void main(String[] args)
    {
    	FindDuplicateEntryInArray duplicate = new FindDuplicateEntryInArray();
        int arr[] = { 1, 2, 1, 3 };
        int arr_size = arr.length;
 
        duplicate.printRepeating(arr, arr_size);
    }
}
