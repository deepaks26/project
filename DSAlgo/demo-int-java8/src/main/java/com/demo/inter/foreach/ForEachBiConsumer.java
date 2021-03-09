package com.demo.inter.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachBiConsumer {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
	     
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		BiConsumer<String, Integer> printMap = new BiConsumer<String, Integer>() {
			
			public void accept(String t, Integer u) {
				System.out.println("Key is : " + t); 
			    System.out.println("Value is : " + u);
				
			}
		};
		map.forEach(printMap);
		BiConsumer<String, Integer> printMapType2 = (a,b) -> {
			System.out.println("Key is : " + a); 
		    System.out.println("Value is : " + b);
		};
		
		map.forEach(printMapType2);
	}
}
