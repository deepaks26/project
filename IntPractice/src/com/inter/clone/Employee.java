package com.inter.clone;

public class Employee implements Cloneable {

	int i;
	String s;
	Department dep;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
