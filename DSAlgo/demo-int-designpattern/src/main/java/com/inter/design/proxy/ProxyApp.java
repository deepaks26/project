package com.inter.design.proxy;

public class ProxyApp {

	public static void main(String[] args) {
		ProxyInternet int1= new ProxyInternet();
		try {
			int1.connectTo("abc.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
