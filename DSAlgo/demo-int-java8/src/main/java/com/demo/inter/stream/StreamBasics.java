package com.demo.inter.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {
	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
		Consumer<Object> print = a -> System.out.println(a);
		intStream.forEach(print);

		Stream<Integer> intArrayStream = Stream.of(new Integer[] { 1, 2, 3, 4 });
		intArrayStream.forEach(print);

		Stream<String> charStream = Stream.of("A%B%C".split("\\%"));
		charStream.forEach(print);

		/**
		 * Stream map
		 */
		Stream<String> strStream = Stream.of("abc", "cde");
		strStream.filter(s -> s.startsWith("a")).map(String::toUpperCase).forEach(print);

		Stream<Integer> st = Stream.of(1, 2, 3);
		Stream<Integer> st1 = Stream.of(new Integer[] { 1, 2, 3 });
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		List<String> list1 = new ArrayList<String>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		for (int i = 1; i < 10; i++) {
			list2.add(i);
		}
		List<List<Integer>> list4 = Arrays.asList(list, list2);

		for (int i = 1; i < 10; i++) {
			list1.add("ABC");
		}

		list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
		list.stream().filter(l -> l % 2 == 0).toArray(Integer[]::new);
		list1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		list1.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList());
		list1.stream().anyMatch(s -> s.startsWith("A"));
		list.stream().filter(a -> a % 2 == 0).count();
		System.out.println(list.stream().filter(l -> l % 2 == 0).reduce(Integer::sum).get());
		list1.stream().reduce((s1, s2) -> s1.concat(s2));
		list1.stream().flatMap(s -> Stream.of(s.charAt(1))).map(s1 -> s1.toString().toUpperCase())
				.forEach(s -> System.out.println(s));

		// to map

		Stream<String> s = Stream.of("apple", "banana", "apricot", "orange", "apple");
		// Map<Character,String> map = s.collect(Collectors.toMap(k-> k.charAt(0), v->
		// v));
		Map<Character, String> map1 = s
				.collect(Collectors.toMap(k -> k.charAt(0), v -> v, String::concat));
		System.out.println(map1);

		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		Map<Integer,Integer> map2 = numbersList.stream().collect(Collectors.toMap(k-> k, v-> 1,Integer::sum));
		System.out.println(map2);
		
		numbersList.stream().distinct();
		
		Consumer<String> con = System.out::println;
		con.accept("abc");
		
		
		Supplier<Integer> sup = "abc"::length;
		System.out.println(sup.get());
		
		Function<String, Integer> fun11 = String::length;
		fun11.apply("ABC");
	
		System.out.println(m1());
		
		Stream<String> s1 = Stream.of("apple", "banana", "apricot", "orange", "apple");
		//s1.map(str -> str.toUpperCase()).forEach(us -> System.out.println(us));
		System.out.println(s1.reduce((str1,str2) ->str1.concat(str2)).get());
		
		Stream<String> s2 = Stream.of("apple", "banana", "apricot", "orange", "apple");
		s2.map(l-> l.toUpperCase()).forEach(System.out::println);
		
		Stream<Integer> i = Stream.of(1,2,3,4,5);
		Double avg = i.collect(Collectors.averagingInt(el -> el));
		Long count = i.collect(Collectors.counting());
		//IntSummaryStatistics  summary = i.collect(Collectors.summarizingInt(i->i));
		
	}
	
	static String m1() {
		try {
			throw new Exception();
			//return "try";
		}catch (Exception e) {
			return "catch";
		}finally {
			return "finally";
		}
	}
}

