package com.inter.codepract.string;

public class CheckDerivedStringByRotation {

	public static boolean checkDerivedStringByRotation(String str1,String str2) {
		for(int i=0;i<str1.length();i++) {
			str1 = str1.substring(1)+str1.charAt(0);
			if(str1.equals(str2)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "DABC";
		System.out.println(checkDerivedStringByRotation(str1,str2));
	}
}
