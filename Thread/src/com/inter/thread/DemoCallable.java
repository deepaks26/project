package com.inter.thread;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class DemoCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		Random random = new Random();
		for (int i = 1; i <= 40; i++) {
			Integer number = random.nextInt(10);
			Future<Integer> result = pool.submit(new FactorialCalculator(number));
			System.out.println("Factorial of " + number + " is " + result.get());
		}

		String str = "a";
		try {

			str += "b";
		} finally {
			str += "c";
		}
		str += "d";
		System.out.println(str);

//		// System.out.println(getShortestFragment("ABcabbCa"));
//	        System.out.println(getShortestFragment("azABaabza"));
//	        System.out.println(getShortestFragment("AcZCbaBz"));
		/*
		 * System.out.println(getShortestFragment("CATattac"));
		 * System.out.println(getShortestFragment("TacoCat"));
		 * System.out.println(getShortestFragment("Madam"));
		 * System.out.println(getShortestFragment("AcZCbaBz"));
		 * System.out.println(getShortestFragment("aZABcabbCa"));
		 */
	}

	static int getShortestFragment(String str) {
		for (int k = 1; k <= str.length(); k++) {
			for (int i = 0; i < str.length() - k + 1; i++) {
				Set<Character> lowerSet = new HashSet<>();
				Set<Character> upperSet = new HashSet<>();
				String temp = str.substring(i, i + k);
				char[] tempCharArr = temp.toCharArray();
				for (char ch : tempCharArr) {
					if (Character.isLowerCase(ch))
						lowerSet.add(ch);
					else
						upperSet.add(ch);
				}
				if (containsAllElements(lowerSet, upperSet) && containsAllElements(upperSet, lowerSet)) {
					return temp.length();
				}
			}
		}
		return -1;
	}

	static boolean containsAllElements(Set<Character> first, Set<Character> second) {
		Set<Character> lower1 = new HashSet<>();
		Set<Character> lower2 = new HashSet<>();
		first.forEach((e) -> {
			lower1.add(Character.toLowerCase(e));
		});
		second.forEach((e) -> {
			lower2.add(Character.toLowerCase(e));
		});
		return lower1.containsAll(lower2);
	}
}
