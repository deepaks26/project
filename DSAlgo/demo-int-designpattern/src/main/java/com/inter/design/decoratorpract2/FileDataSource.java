package com.inter.design.decoratorpract2;

public class FileDataSource implements DataSource {

	
	@Override
	public String read() {
		return "File";
	}

	@Override
	public void write(String str) {
		System.out.println("writing  into file -> "+ str);
		
	}

}