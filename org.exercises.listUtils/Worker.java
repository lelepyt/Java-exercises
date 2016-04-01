package worklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Worker {

	private List<String> list;

	public static void main(String[] args) {
		int value = 1;
		Worker worker = new Worker(value);
		worker.addObject(new String("Volodya"));
		worker.addObject(new String("Vasyl"));
		worker.addObject(new String("Taras"));
		worker.addObject(new String("Andriy"));
		worker.addObject(new String("Yuriy"));
		worker.checkObject("Taras");
		worker.deleteObject(1);
		worker.deleteObject("Taras");
		worker.printObject();
	}

	public void addObject(String name) {
		list.add(name);
	}

	public void checkObject(String name) {
		boolean isPresent = list.contains(name);
		if (isPresent) {
			System.out.println("This string is already  in the list. ");
		} else {
			System.out.println("This string wasn't found in the list");
		}
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

	public Worker(int value) {
		if (value == 1) {
			list = new ArrayList();
		} else {
			list = new LinkedList();
		}
	}
}
