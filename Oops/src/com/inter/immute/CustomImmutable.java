package com.inter.immute;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public final class CustomImmutable {

	private final int id;
	private final Map<String, String> data;

	public CustomImmutable(int id, Map<String, String> data1) {
		this.id = id;
		Map<String, String> tempMap = new HashMap<String, String>();
		BiConsumer<String, String> biC = (k, v) -> {
			tempMap.put(k, v);
		};
		data1.forEach(biC);

		this.data = tempMap;
	}

	public int getId() {
		return id;
	}

	public Map<String, String> getData() {
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : this.data.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
		CustomImmutable ci = new CustomImmutable(1, map);
		System.out.println(ci.getData());
		map.put("3", "third");
		System.out.println(ci.getData());
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("abc",null);
		map1.put("abcd",null);
		System.out.println(map1);
	}
}
