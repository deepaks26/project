package com.demo.inter.lambda;

public class Operation {

	@FunctionalInterface
	interface DoOperate {
		int doJob(int a, int b);
	}

	@FunctionalInterface
	interface Result {
		void print(int whatToPrint);
	}

	public static void main(String[] args) {
		/*
		 * DoOperate optAdd = (int a, int b) -> a+b; DoOperate optMultiply = (int a, int
		 * b) -> a*b; Result printRes = (a) -> { System.out.println(a); };
		 * printRes.print(optAdd.doJob(2, 3));
		 * 
		 * printRes.print(optMultiply.doJob(2, 3));
		 * 
		 * String s1 =new String("abc"); String s2 = new String("abc");
		 * System.out.println(s1==s2);
		 */

		String text = "aabcbaabuaabiaab";

		char ch[] = text.toCharArray();
		StringBuffer sb = new StringBuffer();
		int counter = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j <= i + 2; j++) {
				if (j < ch.length) {
					sb.append(String.valueOf(ch[j]));
				}

			}

			if (sb.toString().equals("aab")) {
				counter++;
				i = i + 2;
			}
			sb = new StringBuffer();
		}
		System.out.println(counter);
	}
}