package com.inter.design.observer;

public class Subcriber1 implements Observer{

	@Override
	public void update(String subject) {
		System.out.println("inside subject1"+ subject);
	}

}
