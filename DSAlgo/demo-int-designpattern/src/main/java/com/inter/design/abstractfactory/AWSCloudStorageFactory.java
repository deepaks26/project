package com.inter.design.abstractfactory;

public class AWSCloudStorageFactory implements CloudStorageFactory {

	@Override
	public CloudStorage getCloudStorage() {
		return new AWSCloudStorage();
	}

}
