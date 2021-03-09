package com.demo.inter.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachStream {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
		Consumer<Integer> print = System.out::println;
		numberList.stream().filter(n -> n%2==0).forEach(print);
	}
}
