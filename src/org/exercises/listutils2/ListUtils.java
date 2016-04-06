package org.exercises.listutils2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtils {

	private List<String> list;

	public void getObjectFromist(int firstFiveElements) {
		if (list.size() >= firstFiveElements) {
			for (int i = 0; i <= firstFiveElements; i += 10) {
				list.get(i);
			}
		} else {
			System.out.println("Five elements not found");
		}
	}

	public void addObjectInList(String name) {
		list.add(name);
	}

	public boolean isObjectPresentInList(String name) {
		boolean isPresent = list.contains(name);
		if (isPresent) {
			System.out.println("This string is already  in the list. ");
		} else {
			System.out.println("This string wasn't found in the list");
		}
		return isPresent;
	}

	public ListUtils(int value) {
		if (value == 1) {
			list = new ArrayList<>();
		} else {
			list = new LinkedList<>();
		}
	}
}
