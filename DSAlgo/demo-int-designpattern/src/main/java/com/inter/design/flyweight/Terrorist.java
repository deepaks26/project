package com.inter.design.flyweight;

public class Terrorist implements Player {

	String task;
	String weapon;

	public Terrorist() {
		this.task = "Plant a bomb";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;

	}

	@Override
	public void mission() {
		System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + task);

	}

}
