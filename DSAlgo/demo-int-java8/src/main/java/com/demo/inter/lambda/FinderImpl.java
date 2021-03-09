package com.demo.inter.lambda;

public class FinderImpl {

	static String doFind(String s1,String s2) {
		return s1.concat(s2);
	}
	
	public static void main(String[] args) {
		Finder finder = (s1,s2) -> s1.concat(s2);
		Finder finder1 = FinderImpl::doFind;
		System.out.println(finder.find("abc", "def"));
		System.out.println(finder1.find("abc", "def"));
		
		
	}
}