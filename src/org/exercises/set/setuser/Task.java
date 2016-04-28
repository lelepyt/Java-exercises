package org.exercises.set.setuser;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Set interface.You have to have a class User with fields like 
//(username, age or something like that ). This class you have 
//to use to create objects for storing in the Set collections. 
//You have to have a dedicated class for this exercise or you 
//can have even more classes. For the Set collection you have 
//to have two instance of the Set interface. One is HashSet 
//another LinkedHashSet. As a first task you have to create 
//different 10 instances of the User class and store them in 
//each collection. Then print them. As a second task you have to 
//create 2 similar objects (same username, age etc) and try to store 
//them in the collections. Accordingly the implementations should not 

public class Task {
	Set<User> hashSet = new HashSet<User>();
	Set<User> linkedHashSet = new LinkedHashSet<User>();

	public void addElements(Set<User> set) {
		String[] names = { "Volodya", "Taras", "Andriy", "Tolik", "Vova", "Vitalik", "Roma", "Andriy", "Kyryll",
				"Olexandr" };
		String[] surnames = { "Zhemevko", "Shunkaryk", "Kuklyak", "Danulchenko", "Corniy", "Lotockiy", "Kryckiy",
				"Dubyk", "Postynak", "Lopatun" };
		String[] usernames = { "lelepyt", "limosha", "manchester", "tolik", "corniy", "vitalya", "romaroma", "andruha",
				"karho", "lopata", };
		int[] ages = { 19, 20, 20, 20, 20, 20, 20, 22, 21, 21 };

		for (int i = 0; i < 10; i++)
			set.add(new User(names[i], surnames[i], usernames[i], ages[i]));
	}

	public void addElementsAndPrintoObjectsFromSet() {
		addElements(hashSet);
		addElements(linkedHashSet);
		printObjectsFromSet(hashSet);
		printObjectsFromSet(linkedHashSet);
	}

	public void addEqualElementsAndPrintoSet() {
		hashSet.clear();
		hashSet.add(new User("Volodya", "Zhemevko", "lelepyt", 19));
		hashSet.add(new User("Volodya", "Zhemevko", "lelepyt", 19));
		linkedHashSet.clear();
		linkedHashSet.add(new User("Volodya", "Zhemevko", "lelepyt", 19));
		linkedHashSet.add(new User("Volodya", "Zhemevko", "lelepyt", 19));
		printObjectsFromSet(hashSet);
		printObjectsFromSet(linkedHashSet);
	}

	public void printObjectsFromSet(Set<User> set) {
		for (User u : set) {
			System.out.println(u.name + "  " + u.surname + "  " + u.username + "  " + u.age);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Task task = new Task();
		task.addElementsAndPrintoObjectsFromSet();
		task.addEqualElementsAndPrintoSet();
	}
}
