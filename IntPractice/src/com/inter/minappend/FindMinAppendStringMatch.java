package com.inter.minappend;

import java.util.*;

public class FindMinAppendStringMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		String str1 = null;
		Integer X=0,Y= 0;
		for(int i=0;i<3;i++) {
			if(i==0) {
				str = sc.nextLine();
				str1 = str;
			}else if(i==1) {
				X = sc.nextInt();
			}else {
				Y = sc.nextInt();
			}
		}
		int count =0;
		while(true) {
			String s1 = str1.substring(0,str.length()-X);
			String s2 = str1.substring(str.length()-X);
			 str1 = s2.concat(s1);
			 count++;
			if(str1.equals(str)) {
				System.out.println("Matched wih number of append  " + count);
				break;
			}else {
				count++;
				String s3 = str1.substring(0,str.length()-Y);
				String s4 = str1.substring(str.length()-Y);
				 str1 = s4.concat(s3);
				if(str1.equals(str)) {
					System.out.println("Matched wih number of append  " + count);
					break;
				}
			}
			
		}
		sc.close();
	}
}
