package com.inter.design.observer;

public class Subscriber2 implements Observer {

	@Override
	public void update(String subject) {
		System.out.println("inside subject2"+ subject);
	}

}
