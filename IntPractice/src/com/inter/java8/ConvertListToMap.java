package com.inter.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class ConvertListToMap {

	public static void main(String[] args) {
		
		List<String> lst = Arrays.asList("java","springboot","angular");
		Map<String,Integer> map = listToMapConverter(lst,(x)-> x.length());
		System.out.println(map);
	}

	private static <T,R> Map<T,R> listToMapConverter(List<T> lst, Function<T, R> fun) {
		Map<T, R> result = new TreeMap();
		lst.forEach(ls -> {
			result.put(ls, fun.apply(ls));
		});
		return result;
	}
}
