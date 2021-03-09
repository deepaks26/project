package com.inter.design.bridge;

public class Bike extends Vehicle {

	public Bike(Workshop worl1, Workshop work2) {
		super(worl1, work2);
	}

	@Override
	public void manufacture() {
		System.out.println("Bike manufactured");
		work1.work();
		work2.work();
	}

}
