package com.inter.codepract.string;

public class LongestPallindromicSubSeqeuencePract1 {

	int pal(String str) {
		
		int length = str.length();
		int maxLentgh = Integer.MIN_VALUE;
		int start = 0;
		for(int i=1;i<str.length();i++) {
			int low = i-1;
			int high =i+1;
			
			while(low>=0 && high<length && str.charAt(low)== str.charAt(high)) {
				if(high-low+1 > maxLentgh) {
					maxLentgh = high-low+1;
					start = low;
				}
				--low;
				++high;
			}
			
			
			 low = i-1;
			high =i;
			
			while(low>=0 && high<length && str.charAt(low)== str.charAt(high)) {
				if(high-low+1 > maxLentgh) {
					maxLentgh = high-low+1;
					start = low;
				}
				--low;
				++high;
			}
		}
		System.out.println(str.substring(start,start+maxLentgh));
		return maxLentgh;
	}
}
