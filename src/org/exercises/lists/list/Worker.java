package org.exercises.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Worker {

	private List<String> list;

	public static void main(String[] args) {
		int value = 1;
		Worker worker = new Worker(value);
		String name = "Volodya";
		String lastName = "Zhemevko";
		worker.addObject(name);
		worker.checkObject(name);
		worker.printObject();
	}

	public void addObject(String name) {
		list.add(name);
	}

	/**
	 * Check value for uniqueness in the list
	 * 
	 * @param name
	 */
	public void checkObject(String name) {

		boolean isPresent = list.contains(name);
		if (isPresent) {
			System.out.println("This string is already  in the list. ");
		} else {
			System.out.println("This string wasn't found in the list");
		}
	}

	public void printObject() {
		System.out.println("Printed list:" + list.toString());
	}

	public Worker(int value) {
		if (value == 1) {
			list = new ArrayList<>();
		} else {
			list = new LinkedList<>();
		}
	}
}
