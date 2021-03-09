package com.inter.design.bridge;

public abstract class Vehicle {

	protected Workshop work1;
	protected Workshop work2;
	public Vehicle(Workshop worl1, Workshop work2) {
		this.work1 = worl1;
		this.work2 = work2;
	}
	
	public abstract void  manufacture();
}
