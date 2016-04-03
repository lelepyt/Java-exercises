

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtils {

	private List<String> list;

	public static void main(String[] args) {
		int value = 1;
		String array[] = { "Volodya", "Vasyl", "Taras", "Andriy", "Yuriy" };
		ListUtils ListUtils = new ListUtils(value);
		ListUtils.addObject(array);
		ListUtils.checkList("Taras");
		ListUtils.deleteObject(1);
		ListUtils.deleteObject("Taras");
		ListUtils.printObject();
	}

	public void addObject(String array[]) {
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
	}

	public boolean checkList(String name) {
		boolean isPresent = list.contains(name);
		if (isPresent) {
			System.out.println("This string is already  in the list. ");
		} else {
			System.out.println("This string wasn't found in the list");
		}
		return isPresent;
	}

	public void printObject() {
		System.out.println("Printed list:" + list.toString());
	}

	public void deleteObject(String object) {
		list.remove(object);
	}

	public void deleteObject(int index) {
		list.remove(index);
	}

	public ListUtils(int value) {
		if (value == 1) {
			list = new ArrayList();
		} else {
			list = new LinkedList();
		}
	}
}
