package com.inter.design.flyweight;

public class CounterTerrorist implements Player {

	String task;
	String weapon;

	public CounterTerrorist() {
		this.task = "Diffuse a bomb";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;

	}

	@Override
	public void mission() {
		System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + task);

	}

}
