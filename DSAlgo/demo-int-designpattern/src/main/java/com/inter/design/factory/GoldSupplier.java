package com.inter.design.factory;

import java.util.function.Supplier;

public class GoldSupplier implements Supplier<Tier> {

	@Override
	public Tier get() {
		return new Gold();
	}

}
