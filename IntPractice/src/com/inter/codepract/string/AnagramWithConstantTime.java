package com.inter.codepract.string;

import java.util.HashMap;
import java.util.Map;

public class AnagramWithConstantTime {

	public static void main(String[] args) {
		System.out.println(checkAnagram("tommarvoloriddle","iamlordvoldemort"));
	}
	static boolean checkAnagram(String str1,String str2) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str1.length();i++) {
			map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i), 0)+1);
		}
		for(int i=0;i<str2.length();i++) {
			if(!map.containsKey(str2.charAt(i))){
				return false;
			}
			map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
			if(map.get(str2.charAt(i))==0) {
				map.remove(str2.charAt(i));
			}
		}
		return map.isEmpty();
	}

}
