package org.exercises.map.mapSort.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.electroSort.impls.Kettle;
import org.electroSort.impls.Microwave;
import org.electroSort.impls.Phone;

public class SortOnPower {

	public void putElementInMap() {
		Kettle kettle = new Kettle();
		Microwave microwave = new Microwave();
		Phone Phone = new Phone();

		Map<Integer, String> unsortMap = new HashMap<Integer, String>();
		unsortMap.put(kettle.sendPower(), kettle.sendName());
		unsortMap.put(microwave.sendPower(), microwave.sendName());
		unsortMap.put(Phone.sendPower(), Phone.sendName());

		Map<Integer, String> treeMap = new TreeMap<Integer, String>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}

		});
		treeMap.putAll(unsortMap);
		printMap(treeMap);

	}

	public static <K, V> void printMap(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getValue() + "" + entry.getKey());

		}
	}
}
