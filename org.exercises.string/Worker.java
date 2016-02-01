
public class Worker {
	/**
	 * check out the similarity of sentences
	 */
	public void worker() {
		ReturnStr qwe = new ReturnStr();
		ReturnStr1 ewq = new ReturnStr1();
		ewq.returnStr1();
		qwe.returnStr();

		if (qwe.returnStr().equals(ewq.returnStr1())) {
			System.out.println("strings are equal");
			editingStr(qwe);
			checkStr1(ewq);
		} else {
			System.out.println("strings are unequal");
			editingStr(qwe);
			checkStr1(ewq);
		}
	}

	/**
	 * edit and output Str
	 * 
	 * @param qwe
	 */
	public void editingStr(ReturnStr qwe) {
		String str = qwe.returnStr();
		String[] parts = str.split(" ");
		String lastWord = parts[parts.length - 1];
		str = str + lastWord;
		String zxc = (str.substring(0, str.lastIndexOf(" ")));
		str = lastWord + zxc;
		System.out.println(str);

	}

	/**
	 * check the first word and output Str1
	 * 
	 * @param ewq
	 */
	public void checkStr1(ReturnStr1 ewq) {
		String str1 = ewq.returnStr1();
		System.out.print("Starts with (String) :");
		System.out.println(str1.startsWith("String"));
		System.out.println(str1);
	}

}
