package org.exercises.map.map;

import java.util.Map;
import java.util.Random;

class MyMap {
	Map<Integer, String> map;
	
	public MyMap(Map<Integer, String> map) {
		this.map = map;
	}

	public void addObjects() {
		String[] string = { "Volodya", "London is", "the capital", "of", "Great Britain.", "Volodya" };
		Random rand = new Random();
		for (String s : string)
			map.put(rand.nextInt(), s);
	}

	@Override
	public String toString() {
		return "Keys: " + map.keySet() + " Values: " + map.values() + "\n";
	}
}