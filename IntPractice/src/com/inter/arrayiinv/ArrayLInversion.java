package com.inter.arrayiinv;

import java.util.Scanner;

public class ArrayLInversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		String ss = null;
		for (int i1 = 0; i1 < 1; i1++) {
			ss = sc.nextLine();
		}
		String str[] = ss.split(" ");
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		int invCount=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					invCount++;
				}
			}
		}
		System.out.println(invCount);
	}
}