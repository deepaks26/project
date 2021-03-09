package com.inter.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

	private static Map<String,Player> map = new HashMap<String,Player>();
	public static Player getPlayer(String type) {
		Player  p =null;
		if(map.containsKey(type)) {
			return map.get(type);
		}else {
			switch (type) {
			case "Terrorist":
				System.out.println("Terrorist created");
				p = new Terrorist();
				break;
			case "Counter Terrorist":
				System.out.println("Counter Terrorist created");
				p = new CounterTerrorist();
				break;
			default:
				break;
			}
		}
		return p;
	}
}
