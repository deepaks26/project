package com.demo.inter.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateApp {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("A", "B");
		Predicate<String> p  = (s) -> s.startsWith("A");
		Consumer<String> con = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				if(p.test(t)) {
					System.out.println(t);
				}
				
			}
		};
		names.forEach(con);
	}
}
