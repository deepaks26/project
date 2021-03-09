package com.inter.design.decoratorpract2;

public class AWSDataSource implements DataSource {


	@Override
	public String read() {
		return "reading data from AWS datasource";
	}

	@Override
	public void write(String str) {
		System.out.println("writing  into AWS data source -> "+ str);
		
	}
}
