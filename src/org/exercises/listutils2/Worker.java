package org.exercises.listutils2;

public class Worker {

	private ListUtils listUtils;

	public void addObjectsByListUtils(int numberObjects, String name) {
		long startTime = System.nanoTime();
		for (int i = 0; i < numberObjects; i++) {
			listUtils.addObjectInList(name);
		}
		long endTime = System.nanoTime();
		double oneNanoseconds = (endTime - startTime);
		oneNanoseconds = oneNanoseconds / 1000000;
		System.out.println("Time spent on adding objects: " + (oneNanoseconds) + " milliseconds");
	}

	public void getObjectsByListUtils(int firstFiveElements) {
		long startTime = System.nanoTime();
		listUtils.getObjectFromist(firstFiveElements);
		long endTime = System.nanoTime();
		double oneNanoseconds = (endTime - startTime);
		oneNanoseconds = oneNanoseconds / 1000000;
		System.out.println("Time spent on getting access to objects: " + (oneNanoseconds) + " milliseconds");
	}

	public Worker(int value) {
		if (value == 1) {
			listUtils = new ListUtils(1);
		} else {
			listUtils = new ListUtils(0);
		}
	}
}
