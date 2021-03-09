package com.inter.design.abstractfactory;

public class OracleCloudStorageFactory implements CloudStorageFactory {

	@Override
	public CloudStorage getCloudStorage() {
		return new OracleCloudStorage() ;
	}

}
