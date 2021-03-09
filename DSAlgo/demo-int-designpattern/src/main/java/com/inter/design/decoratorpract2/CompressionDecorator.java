package com.inter.design.decoratorpract2;

public class CompressionDecorator extends DataSourceDecorator {

	public CompressionDecorator(DataSource dataSrcWrapper) {
		super(dataSrcWrapper);
	}

	@Override
	public String read() {
		return "Uncompressed "+ super.read();
	}

	@Override
	public void write(String str) {
		super.write("compressed "+str);
		
	}
}
