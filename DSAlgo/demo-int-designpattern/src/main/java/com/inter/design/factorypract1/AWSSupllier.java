package com.inter.design.factorypract1;

import java.util.function.Supplier;

public class AWSSupllier implements Supplier<CloudStorage>{

	@Override
	public CloudStorage get() {
		return new AWSStorage();
	}

}
