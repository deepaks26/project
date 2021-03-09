package com.inter.design.flyweight;

import java.util.Random;

public class CounterStrike {
	private static String[] player= new String[] {"Terrorist","Counter Terrorist"};
	private static String[] weapons =   {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Player p = PlayerFactory.getPlayer(getRandomPlayer());
			p.assignWeapon(getRandomWeapon());
			p.mission();
		}
	}
	
	static String getRandomPlayer() {
		Random r = new Random();
		int playInt = r.nextInt(player.length);
		return player[playInt];
	}
	

	static String getRandomWeapon() {
		Random r = new Random();
		int playInt = r.nextInt(weapons.length);
		return weapons[playInt];
	}
}
