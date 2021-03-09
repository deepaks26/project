package com.inter.design.abstractfactory;

public class App {

	public static void main(String[] args) {
		CloudStorageFactory fact = new OracleCloudStorageFactory();
		OracleCloudStorage stroeage = (OracleCloudStorage) fact.getCloudStorage();
		stroeage.write("Deepak");
	}
}
