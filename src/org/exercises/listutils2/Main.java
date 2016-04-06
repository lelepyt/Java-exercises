package org.exercises.listutils2;

public class Main {

	public static void main(String[] args) {
		int arrayListIndex = 1;
		int linkedListIndex = 0;
		System.out.println("ArrayList");
		execute(arrayListIndex);
		System.out.println("\n******************************************\n");
		System.out.println("LinkedList");
		execute(linkedListIndex);
	}

	private static void execute(int value) {
		int numberObjects = 100000;
		int firstFiveElements = 50000;
		String name = "Volodya";
		Worker worker = new Worker(value);
		worker.addObjectsByListUtils(numberObjects, name);
		worker.getObjectsByListUtils(firstFiveElements);
	}
}
