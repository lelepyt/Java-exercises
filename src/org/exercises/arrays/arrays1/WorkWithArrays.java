package org.exercises.arrays1;

import java.util.Random;

public class WorkWithArrays {

	public void changeArrays() {

		Random generator = new Random();
		int maximumAmountOfMemory = 9;
		int randomString = generator.nextInt(maximumAmountOfMemory);
		String[] array1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		String[] array2 = new String[randomString];
		workingWithArray1(array1);
		workingWithArray2(array2, randomString);
	}

	/**
	 * Output numbers backwards
	 * 
	 * @param array1
	 */
	private void workingWithArray1(String[] array1) {

		for (int max = 9; max > 0; max--) {
			System.out.print(array1[max - 1] + "; ");
		}
		System.out.println("\n");
	}

	/**
	 * Recording random string in the array2
	 * 
	 * @param array2
	 * @param tempArray2
	 */
	private void workingWithArray2(String[] array2, int randomElement) {
		String[] tempArray2 = { "Dog", "Bob", "Rich", "Fox", "Jim", "Cat", "Fish", "Moon", "Joke", "Hey" };
		randomElement = randomElement - 1;
		Random generator = new Random();
		for (int indexes = 0; indexes <= randomElement; indexes++) {
			int randomElement1 = generator.nextInt(randomElement);
			array2[indexes] = tempArray2[randomElement1];
			System.out.print(array2[indexes] + "; ");
		}
		System.out.println( "\nnumber of element: " + array2.length);
	}
}