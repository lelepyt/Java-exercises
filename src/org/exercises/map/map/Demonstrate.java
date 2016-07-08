package org.exercises.map.map;

import java.util.*;

public class Demonstrate {
	// Map. You have write a small program which demonstrates all available
	// implementation of Map interface in java
	public static void main(String[] args) {

		MyMap hashMap = new MyMap(new HashMap<Integer, String>());
		hashMap.addObjects();
		System.out.println(hashMap.toString());

		MyMap treeMap = new MyMap(new TreeMap<Integer, String>());
		treeMap.addObjects();
		System.out.println(treeMap.toString());

		MyMap linketHeshMap = new MyMap(new LinkedHashMap<Integer, String>());
		linketHeshMap.addObjects();
		System.out.println(linketHeshMap.toString());
	}
}
