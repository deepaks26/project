package com.inter.codepract.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapInJava8 {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(k-> k, v->v));
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(k->k, v->v));
	}
}
