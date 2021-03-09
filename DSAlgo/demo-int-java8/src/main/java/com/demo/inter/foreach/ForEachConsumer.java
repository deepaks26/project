package com.demo.inter.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachConsumer {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alex", "Brian", "Charles");
		Consumer<String> makeUpperCase = new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t.toUpperCase());
				
			}
		};
		names.forEach(makeUpperCase);
	}
}
