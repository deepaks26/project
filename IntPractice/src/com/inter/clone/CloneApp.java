package com.inter.clone;

public class CloneApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department dep = new Department();
		dep.name = "DEP";
		
		Employee ep1 = new Employee();
		ep1.i = 1;
		ep1.s = "abc";
		ep1.dep = dep;
		
		Employee ep2 = (Employee)ep1.clone();
		ep2.i = 2;
		ep2.s = "xyz";
		ep2.dep.name = "dep";
		System.out.println(ep2==ep1);
		System.out.println(ep1.i);
		System.out.println(ep2.i);
		System.out.println(ep1.s);
		System.out.println(ep2.s);
		System.out.println(ep1.dep.name);
		System.out.println(ep2.dep.name);
		
	}
}
