package com.inter.design.factorypract1;

import java.util.function.Supplier;

public class OracleSupplier implements  Supplier<CloudStorage> {

	@Override
	public CloudStorage get() {
		return new OracleStorage();
	}

}
