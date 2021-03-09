package com.demo.inter.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread{
	public MyThread() {
	System.out.println("My Thread");	// TODO Auto-generated constructor stub
	}
	public void run() {
		System.out.println("Bar");
	}
	public void run(String s) {
		System.out.println("Baz");
	}
	
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("3");
		ls.add("7");
		ls.add("5");
		List<String> ls1 = new MyThread().doS(ls);
		ls1.add("1");
		System.out.println(ls);
		
	}
	
	
	List<String> doS(List<String> ll){
		ll.add("9");
		return ll;
	}
}
