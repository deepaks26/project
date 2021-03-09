package com.inter.codepract.string;

public class MaxOccuringCharInString {

	public static void main(String[] args) {
		System.out.println(findMaxOccuringInString("hello"));
	}
	static char findMaxOccuringInString(String str) {
		int countArr[] = new int[256];
		for(int i=0;i<str.length();i++) {
			countArr[str.charAt(i)]++;
		}
		
		int max = Integer.MIN_VALUE;
		char result = ' ';
		for(int i=0;i<str.length();i++) {
			if(countArr[str.charAt(i)]>max) {
				max = countArr[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
}
