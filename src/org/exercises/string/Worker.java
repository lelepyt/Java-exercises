package org.exercises.string;

public class Worker {
	/**
	 * check out the similarity of sentences
	 */
	public void worker(String str, String str1) {

		if (str.equals(str1)) {
			System.out.println("strings are equal");
			editingStr(str1, str);
		} else {
			System.out.println("strings are unequal");
			editingStr(str1, str);
		}
	}

	/**
	 * edit and output Str
	 * 
	 * @param qwe
	 */
	public void editingStr(String str1, String str) {

		String[] parts = str.split(" ");
		String lastWord = parts[parts.length - 1];
		String zxc = (str.substring(0, str.lastIndexOf(" ")));
		str = lastWord + zxc;
		System.out.println(str);
		checkStr1(str1);
	}

	/**
	 * check the first word and output Str1
	 * 
	 * @param ewq
	 */
	public void checkStr1(String str1) {

		System.out.print("Starts with (String) :\t" + str1.startsWith("String") + "\n" + str1);

	}
}