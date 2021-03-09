package com.inter.design.decoratorpract2;

public class DataSourceDecorator implements DataSource {

	DataSource dataSrcWrapper;
	
	public DataSourceDecorator(DataSource dataSrcWrapper) {
		this.dataSrcWrapper = dataSrcWrapper;
	}
	
	@Override
	public String read() {
		return dataSrcWrapper.read();
	}

	@Override
	public void write(String str) {
		dataSrcWrapper.write(str);
		
	}

}
