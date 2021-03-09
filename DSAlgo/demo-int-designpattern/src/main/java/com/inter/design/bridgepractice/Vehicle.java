package com.inter.design.bridgepractice;

public abstract class Vehicle {

	Workshop w1;
	Workshop w2;
	
	public abstract void manufacture();

	public Vehicle(Workshop w1, Workshop w2) {
		this.w1 = w1;
		this.w2 = w2;
	}
}
