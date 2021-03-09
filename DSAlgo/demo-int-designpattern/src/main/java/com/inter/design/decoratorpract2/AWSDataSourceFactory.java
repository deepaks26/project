package com.inter.design.decoratorpract2;

public class AWSDataSourceFactory implements AbstractDataSourceFactory {

	@Override
	public DataSource getDataSource() {
		return new AWSDataSource();
	}

}
