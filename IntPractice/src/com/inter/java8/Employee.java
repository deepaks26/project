package com.inter.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Employee  implements Comparable<Employee>{

	long id;
	String name;
	
	public Employee(long id,String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Employee o) {
		return (int)(this.id - o.id);
	}
	
	public static void main(String[] args) {
		
		String s =  "deeepak";
		String s1 = new String("deepak");
		System.out.println(s==s1);
		/*
		 * Map<String, Employee> map = new HashMap<>();
		 * 
		 * Employee employee1 = new Employee(1L, "Mher"); map.put(employee1.getName(),
		 * employee1); Employee employee2 = new Employee(22L, "Annie");
		 * map.put(employee2.getName(), employee2); Employee employee3 = new
		 * Employee(8L, "John"); map.put(employee3.getName(), employee3); Employee
		 * employee4 = new Employee(2L, "George"); map.put(employee4.getName(),
		 * employee4);
		 * 
		 * TreeMap<String,Employee> tmap = new TreeMap<String,Employee>(map);
		 * List<String> list = new ArrayList(map.keySet()); Collections.sort(list,new
		 * Comparator() { public int compare(Object o1,Object o2) { return
		 * ((Map.Entry)o1).getValue()-((Map.Entry)o2).getValue() }
		 * 
		 * });
		 * 
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey());
		 * map.entrySet().stream().sorted(Map.Entry.comparingByValue());
		 */
		
	}
}
