package org.exercises.lists.convertinglistandarrary;

import java.util.Arrays;
import java.util.List;

public class Converting {

	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(array);
		Integer[] array2 = (Integer[]) list.toArray();

		System.out.println("Print list: " + list.toString());
		System.out.print("Print array: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "  ");
		}
	}
}
