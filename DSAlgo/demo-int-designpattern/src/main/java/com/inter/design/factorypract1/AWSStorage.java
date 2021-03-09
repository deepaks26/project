package com.inter.design.factorypract1;

public class AWSStorage implements CloudStorage {

	@Override
	public void write(String str) {
		System.out.println("Writing into AWS");
	}

	@Override
	public String read() {
		return "AWS storage";
	}

}
