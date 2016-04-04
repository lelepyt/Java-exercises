package org.exercises.string;

public class Main {

	public static void main(String[] args) {

		Worker worker = new Worker();
		String str1 = new String("String is a java class which cannot be extended. Why?");
		String str = "String is a java class which cannot be extended. Why?";
		worker.worker(str, str1);
	}
}
