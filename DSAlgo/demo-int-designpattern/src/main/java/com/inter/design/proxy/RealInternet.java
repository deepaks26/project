package com.inter.design.proxy;

public class RealInternet implements Internet {

	public void connectTo(String host){
		System.out.println("Connected to " + host);
	}
}
