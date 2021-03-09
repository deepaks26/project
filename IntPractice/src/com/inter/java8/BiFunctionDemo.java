package com.inter.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BiFunctionDemo {

	String s;
	
	BiFunctionDemo(String s){
		this.s = s;
	}
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFun = (x1,x2) -> x1*x2;
		Function<Integer, String> fun = (x1) -> x1.toString();
		System.out.println(applyBi(2,4,biFun,fun));
		
		/*
		 * BinaryOperator<Integer> bin = (x1,x2) -> x1+x2;
		 * System.out.println(bin.apply(2, 3));
		 */
				
		String s = "abc";
		Consumer<String> cn = (String ss) -> System.out.println(s);
		
		/**
		 * prediate
		 */
		Predicate<String> pd = (String ss) -> s!=null;
		pd.test("abc");
		
		cn.accept(s);
		print(s::length);
		Function<String, Integer> funS = String::length;
		System.out.println(funS.apply(s));
		
		Function<String, BiFunctionDemo> funCon  = BiFunctionDemo::new;
		funCon.apply("abc");
	}
	
	static String applyBi(Integer a,Integer b, BiFunction<Integer, Integer, Integer> biFun,Function<Integer, String> fun){
		return biFun.andThen(fun).apply(a, b);
	}
	
	public static void print(Supplier<Integer> supplier)
	   {
	      System.out.println(supplier.get());
	   }
}
