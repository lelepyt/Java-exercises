package org.exercises.set.setsort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Set interface. You have to have a class User with fields like (username, age
//or something like that ). This class you have to use to create objects for
//storing in the Set collection. For Set implementation you have to use 
//TreeMap. You have to store 100 objects in the collection and the 
//objects should be sorted by age. From youngest to oldest
//Set interface continue. To the previous task you have to add a method 
//which will sort the objects in the collection from oldest to youngest using Comparator interface.

public class Task {
	Set<User> treeSet;

	String[] names = { "Volodya", "Taras", "Andriy", "Tolik", "Vova",
						"Vitalik", "Roma", "Andriy", "Kyryll", "Olexandr" };
	String[] surnames = { "Zhemevko", "Shunkaryk", "Kuklyak", "Danulchenko","Corniy", 
							"Lotockiy", "Kryckiy", "Dubyk", "Postynak", "Lopatun" };
	String[] usernames = { "lelepyt", "limosha", "manchester", "tolik",	"corniy", 
							"vitalya", "romaroma", "andruha","karho", "lopata", };
	int[] ages = { 19, 20, 20, 20, 20, 20, 20, 22, 21, 21 };

	public Task(Comparator<Object> c) {
		treeSet = new TreeSet<User>(c);
	}

	public void addElementsInSet(Set<User> set) {
		for (int i = 0; i < 10; i++) {
			set.add(new User(names[i], surnames[i], usernames[i], ages[i]));
		}
	}

	public void addElementAndPrintoObjectsFromSet() {
		addElementsInSet(treeSet);
		printObjectsFromSet(treeSet);
	}

	public void printObjectsFromSet(Set<User> set) {
		for (User u : set) {
			System.out.println(u.name + "  " + u.surname + "  " + u.username + "  " + u.age);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Task task1 = new Task(User.getAgeComparator());
		task1.addElementAndPrintoObjectsFromSet();
		Task task2 = new Task(User.getReverseAgeComparator());
		task2.addElementAndPrintoObjectsFromSet();
	}
}
