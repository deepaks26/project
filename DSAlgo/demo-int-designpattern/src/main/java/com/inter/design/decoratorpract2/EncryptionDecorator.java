package com.inter.design.decoratorpract2;

public class EncryptionDecorator extends DataSourceDecorator {

	public EncryptionDecorator(DataSource dataSrcWrapper) {
		super(dataSrcWrapper);
	}
	@Override
	public String read() {
		return "UnEncrypted" + super.read();
	}

	@Override
	public void write(String str) {
		super.write( "Encrypted" + str);
		
	}
	
}
