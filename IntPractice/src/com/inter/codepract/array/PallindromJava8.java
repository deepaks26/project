package com.inter.codepract.array;

import java.util.stream.IntStream;

public class PallindromJava8 {

	public static void main(String[] args) {
		String s = "RADAR";
		System.out.println(IntStream.range(0, s.length()/2).noneMatch(i-> s.charAt(i)!=s.charAt(s.length()-i-1)));
	}
}
