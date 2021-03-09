package com.inter.design.strategy;

public class Ken extends Fighter {

	public Ken(JumpBehaviour jumpB, RunBehaviour runB) {
		super(jumpB, runB);
	}

	@Override
	public void display() {
		System.out.println("ken fights");
	}

}
