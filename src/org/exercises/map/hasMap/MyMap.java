package org.exercises.map.hasMap;

import java.util.HashMap;
import java.util.Map;

//Map. you have to write a small program which will demonstrate usage of HasMap implementation 
//of the Map interface. You may store a couple of objects in the map with 
//arbitrary keys. It may be String class as key and value other java class.
public class MyMap {
	Map<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String[] args) {
		MyMap myMap = new MyMap();
		myMap.addObjectsInHashMap();
		System.out.println(myMap.toString());
		myMap.printName();
		myMap.clearMap();
		System.out.println(myMap.toString());

	}

	public void addObjectsInHashMap() {
		map.put(null, "Volodya");
		map.put(1, "London");
		map.put(2, "is");
		map.put(3, "the");
		map.put(4, "capital");
		map.put(5, "of");
		map.put(6, "Great");
		map.put(7, "Britain");
		map.put(15, ".");
		map.put(8, "Volodya");

	}

	public void printName() {
		System.out.println(map.get(2));
	}

	public void clearMap() {
		map.clear();
	}

	public String toString() {
		return "Keys: " + map.keySet() + " Values: " + map.values() + "\n";
	}
}
