package com.inter.design.decoratorpract2;

import java.util.HashMap;
import java.util.Map;

public class DataSoruceFactoryProvider {

	static Map<String,AbstractDataSourceFactory> map = new HashMap<String,AbstractDataSourceFactory>();
	
	static {
		map.put("ORACLE", new OracleDataSourceFactory());
		map.put("AWS", new AWSDataSourceFactory());
	}
	
	AbstractDataSourceFactory getFactory(String factoryType){
		return map.get(factoryType);
	}
	
	void register(String type,AbstractDataSourceFactory fact) {
		map.put(type,fact);
	}
	
	public static void main(String[] args) {
		AbstractDataSourceFactory fact = new AWSDataSourceFactory();
		DataSoruceFactoryProvider ds = new DataSoruceFactoryProvider();
		ds.register("abc", fact);
		AbstractDataSourceFactory fact1  = ds.getFactory("abc");
		AWSDataSource dss = (AWSDataSource) fact1.getDataSource();
		System.out.println(dss.read());
		
	}
}