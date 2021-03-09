package com.inter.design.bridgepractice;

public class BridgeClient {

	public static void main(String[] args) {
		Vehicle v = new Car(new Produce(),new Assemble());
		v.manufacture();
	}
	
}
