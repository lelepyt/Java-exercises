package org.exercises.arrays

import java.util.Random;

public class WorkWithArrays {

	public void changeArrays() {

		Random generator = new Random();
		int maximumAmountOfMemory = 9;
		int randomString = generator.nextInt(maximumAmountOfMemory);
		String[] array1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		String[] array2 = new String[randomString];
		workingWithArrays1(array1);
		workingWithArrays2(array2, randomString);
	}

	/**
	 * output numbers backwards
	 * 
	 * @param array1
	 */
	private void workingWithArrays1(String[] array1) {

		for (int max = 9; max > 0; max--) {
			System.out.print(array1[max - 1] + "; ");
		}
		System.out.println("\n");
	}

	/**
	 * recording random string in the array2
	 * 
	 * @param array2
	 * @param tempArray2
	 */
	private void workingWithArrays2(String[] array2, int randomElement) {
		String[] tempArray2 = { "Dog", "Bob", "Rich", "Fox", "Jim", "Cat", "Fish", "Moon", "Joke", "Hey" };
		randomElement = randomElement - 1;
		Random generator = new Random();
		for (int iq = 0; iq <= randomElement; iq++) {
			int randomElement1 = generator.nextInt(randomElement);
			array2[iq] = tempArray2[randomElement1];
			System.out.print(array2[iq] + "; ");
		}

		System.out.println( "\nnumber of element: " + array2.length);

	}

}