package com.inter.design.visitor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClienApp {
	public static void main(String[] args) {
		Book  b1 = new Book(2, 50);
		Book b2  = new Book(3,25);
		CartImpl impl = new CartImpl();
		System.out.println("b1 price ->"+ b1.accpet(impl));
		System.out.println("b2 price ->"+ b2.accpet(impl));
		
		HashMap<String,String> map = new HashMap<String,String>();
		Set<Entry<String,String>> set = map.entrySet();
		Iterator<Map.Entry<String,String>> itr  = set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry  = itr.next();
			entry.getKey();
			entry.getValue();
		}
		
		map.forEach((k,v) -> {
			System.out.println(k);
			System.out.println(v);
		});
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();  
		//addding keys and values to HashMap  
		hm.put(23, "Yash");  
		hm.put(17, "Arun");  
		hm.put(15, "Swarit");  
		hm.put(9, "Neelesh");  
		
		Collection<String> list = hm.values();
		while(hm.keySet().iterator().hasNext()) {
		
		}
		
	}
}
