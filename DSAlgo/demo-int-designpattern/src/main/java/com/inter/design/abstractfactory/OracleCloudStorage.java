package com.inter.design.abstractfactory;

public class OracleCloudStorage implements CloudStorage {

	@Override
	public void write(String str) {
		System.out.println("writing into oracle");
		
	}

	@Override
	public String read() {
		return "Oracle storage";
	}


}
