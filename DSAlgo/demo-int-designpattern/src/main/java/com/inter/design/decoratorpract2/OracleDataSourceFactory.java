package com.inter.design.decoratorpract2;

public class OracleDataSourceFactory implements AbstractDataSourceFactory {

	@Override
	public DataSource getDataSource() {
		return new OracleDataSource();
	}

}
