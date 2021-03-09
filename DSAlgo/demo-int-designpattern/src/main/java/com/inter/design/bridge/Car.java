package com.inter.design.bridge;

public class Car extends Vehicle {

	public Car(Workshop work1, Workshop work2) {
		super(work1, work2);
	}

	@Override
	public void manufacture() {
		System.out.println("Car manufactured");
		work1.work();
		work2.work();

	}

}
