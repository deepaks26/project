package com.inter.design.decoratorpract2;

public class EmailEventListner implements EventListner {

	@Override
	public void update(String eventType, String message) {
		System.out.println(eventType + "has happend with " + message);
	}

	

}
