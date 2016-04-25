
package org.exercises.setinterface;

import java.util.Set;
import java.util.TreeSet;

//Set interface. You have to have a class User with fields like
//(username, age or something like that ). This class you have
//to use to create objects for storing in the Set collection. 
//For Set implementation you have to use TreeMap. You have to 
//store in the collection 10 objects. Then you should create 2 
//similar objects as are present in the collection 
//(same username, age etc) and try to store them in the collection.
//Accordingly the collection should not allow you to store the duplicates.

public class Task {
	Set<User> treeSet = new TreeSet<>(User.getNameComparator());

	public void addElementInSet(Set<User> set) {
		String[] names = { "Volodya", "Taras", "Andriy", "Tolik", "Vova", 
							"Vitalik", "Roma", "Andriy", "Kyryll",	"Olexandr" };
		String[] surnames = { "Zhemevko", "Shunkaryk", "Kuklyak", "Danulchenko", "Corniy", 
							"Lotockiy", "Kryckiy", "Dubyk", "Postynak", "Lopatun" };
		String[] usernames = { "lelepyt", "limosha", "manchester", "tolik", "corniy", 
							"vitalya", "romaroma", "andruha", "karho", "lopata", };
		int[] ages = { 19, 20, 20, 20, 20, 20, 20, 22, 21, 21 };

		for (int i = 0; i < 10; i++)
			set.add(new User(names[i], surnames[i], usernames[i], ages[i]));
	}

	public void addElementAndPrintoObjectsFromSet() {
		addElementInSet(treeSet);
		printObjectsFromSet(treeSet);
	}

	public void addEqualElementsAndPrinToSet() {
		User user1 = new User("Volodya", "Zhemevko", "lelepyt", 19);
		User user2 = user1;		
		treeSet.clear();		
		treeSet.add(user1);
		treeSet.add(user2);
		printObjectsFromSet(treeSet);
	}

	public void printObjectsFromSet(Set<User> set) {
		for (User u : set) {
			System.out.println(u.name + "  " + u.surname + "  " + u.username + "  " + u.age );
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Task task = new Task();
		task.addElementAndPrintoObjectsFromSet();
		task.addEqualElementsAndPrinToSet();
	}
}
