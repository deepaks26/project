package com.inter.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Practice {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("xyz");
		list.add("pqr");
		
		System.out.println(list.stream().map(s-> s.toUpperCase()).collect(Collectors.toList()));
		
		list.stream().
				flatMap(x -> Stream.of(x.charAt(2))).forEach(y -> System.out.println(y));
		Predicate<String> p = s -> s.startsWith("a");
		
		list.stream().filter(p).forEach(System.out::println);
		
		String s = "abc";
		String s1 = "abc";
		List<String> ls = Arrays.asList(s.split(""));
		List<String> ls1 = Arrays.asList(s1.split(""));
		
		int size = ls.size();
		ls.retainAll(ls1);
		if(ls.size()==ls1.size() && size==ls.size()) {
			System.out.println("anagram");
		}
		//Collections.sort(list, Comparator.comparing(String ::length).thenComparing(other));
		/*
		 * Collections.sort(ls); Collections.sort(ls1); int index=0; boolean isAnagram =
		 * true; for(int i=0;i<ls.size();i++) { if(!ls.get(i).equals(ls1.get(i))) {
		 * isAnagram = false; break; } } System.out.println(sb.toString().equals(s));
		 */
		String pall = "RADAR";
		boolean isPall = IntStream.range(0, pall.length()/2).noneMatch(i-> pall.charAt(i)!= pall.charAt(pall.length()-i-1));
		System.out.println(isPall);
		
		
		Function<String, Integer> fun = String ::length; // ??
		//System.out.println(sup.get()); 
		
		String s11 = "Arpan";
		long t = IntStream.of(2, 3).map(s::charAt).count();
		
		BiFunction<String, Integer, Character> f = String::charAt;
		f.apply("abc", 1);

	}

}