package com.inter.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> fun = (str) -> str.length();
		int length = fun.apply("abc");
		System.out.println(length);
		
		Function<String, Integer> func1 = (str) -> str.length();
		Function<Integer, Integer> func2 = (lng) -> lng*2;
		int lng = func1.andThen(func2).apply("abc");
		System.out.println(lng);
		
		List<String> ls = new ArrayList<String>();
		//ls.stream().collect(Collectors.groupingBy(String :: Integer.pa))
		
	}
}
