package com.inter.design.factorypract1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Factory {

	static Map<String,Supplier<? extends CloudStorage>> map = new HashMap();
	
	static {
		map.put("AWS", new AWSSupllier());
		map.put("ORACLE", new OracleSupplier());
	}
	
	void register(String str,Supplier<? extends CloudStorage> supp){
		map.put(str, supp);
	}
	
	CloudStorage get(String key) {
		return map.get(key).get();
	}
}