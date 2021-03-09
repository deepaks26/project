package com.inter.design.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TierFactory {

	private static final Map<String, Supplier<? extends Tier>> tierMap = new HashMap<String, Supplier<? extends Tier>>();;

	static {
		tierMap.put("blue", new BlueSupplier());
		tierMap.put("gold", new GoldSupplier());
	}
	
	public static void register(String type, Supplier<? extends Tier> supplier) {
		tierMap.put(type,supplier);
	}
	    
	public static Tier getTier(String type) {
		return tierMap.get(type).get();
	}
}
