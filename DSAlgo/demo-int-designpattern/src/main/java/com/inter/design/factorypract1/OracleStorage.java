package com.inter.design.factorypract1;

public class OracleStorage implements CloudStorage {

	@Override
	public void write(String str) {
		System.out.println("writing into oracle");
		
	}

	@Override
	public String read() {
		return "Oracle storage";
	}

}