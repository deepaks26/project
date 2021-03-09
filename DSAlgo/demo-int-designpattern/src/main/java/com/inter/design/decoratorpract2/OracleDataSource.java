package com.inter.design.decoratorpract2;

public class OracleDataSource implements DataSource {

	private EventManager event;
	
	public OracleDataSource() {
		
	}
	
	public EventManager getEvent() {
		return event;
	}

	public void setEvent(EventManager event) {
		this.event = event;
	}

	@Override
	public String read() {
		event.notify("READ", "reading data from oracle datasource");
		return "reading data from oracle datasource";
	}

	@Override
	public void write(String str) {
		event.notify("WRITE", "writing  into oracle data source -> "+ str);
		System.out.println("writing  into oracle data source -> "+ str);
		
	}

}
