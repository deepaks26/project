package com.inter.notinsecondstring;

public class ToUperCase {
	public static void main(String[] args) {
		String str1 = "failure is just practice for success";
		String str2 = "is practice";
		String str = "";
		String[] s1Split = str1.split(" ");
		for (int i = 0; i < s1Split.length; i++) {
			if (!str2.contains(s1Split[i])) {
				char fi = s1Split[i].charAt(0);
				str = str.concat(String.valueOf(fi).toUpperCase().concat(s1Split[i].substring(1))).concat(" ");
			} else {
				str = str.concat(s1Split[i]).concat(" ");
			}
		}
		
		System.out.println(str);
	}
}
