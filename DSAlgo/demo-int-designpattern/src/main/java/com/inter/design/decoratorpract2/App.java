package com.inter.design.decoratorpract2;

public class App {

	public static void main(String[] args) {
		
		EventManager event = new EventManager();
		EventListner eventList = new EmailEventListner();
		event.subscribe("READ", eventList);
		event.subscribe("WRITE", eventList);
		
		
		AbstractDataSourceFactory fact = new DataSoruceFactoryProvider().getFactory("ORACLE");
		OracleDataSource ds = (OracleDataSource) fact.getDataSource();
		ds.setEvent(event);
		
		
		DataSourceDecorator dsd = new CompressionDecorator(new EncryptionDecorator(ds));
		dsd.write("Deepak");
		System.out.println(dsd.read());
		
		
	}
}
