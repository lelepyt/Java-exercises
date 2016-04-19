/*Set interface.You have to have a class User with fields like 
 * (username, age or something like that ). This class you have 
 * to use to create objects for storing in the Set collections. 
 * You have to have a dedicated class for this exercise or you 
 * can have even more classes. For the Set collection you have 
 * to have two instance of the Set interface. One is HashSet 
 * another LinkedHashSet. As a first task you have to create 
 * different 10 instances of the User class and store them in 
 * each collection. Then print them. As a second task you have to 
 * create 2 similar objects (same username, age etc) and try to store 
 * them in the collections. Accordingly the implementations should not 
 * allow you to store the duplicates
 */
package org.exercises.setuser;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task {
	HashSet<User> hashSet = new HashSet<User>();
	LinkedHashSet<User> linkedHashSet = new LinkedHashSet<User>();

	public void addElements(Set set) {
		set.add(new User("Volodya", "Zhemevko", "lelepyt", 19));
		set.add(new User("Taras", "Shunkaryk", "limosha", 20));
		set.add(new User("Andriy", "Kuklyak", "manchester", 20));
		set.add(new User("Tolik", "Danulchenko", "tolik", 20));
		set.add(new User("Vova", "Corniy", "corniy", 20));
		set.add(new User("Vitalik", "Lotockiy", "vitalya", 20));
		set.add(new User("Roma", "Kryckiy", "romaroma", 20));
		set.add(new User("Andriy", "Dubyk", "andruha", 22));
		set.add(new User("Kyryll", "Postynak", "karho", 21));
		set.add(new User("Olexandr", "Lopatun", "lopata", 21));
	}

	public void action1() {
		addElements(hashSet);
		addElements(linkedHashSet);
		print(hashSet);
		print(linkedHashSet);
	}

	public void action2() {
		User user1 = new User("Volodya", "Zhemevko", "lelepyt", 19);
		User user2 = user1;
		hashSet.clear();
		hashSet.add(user1);
		hashSet.add(user2);
		linkedHashSet.clear();
		linkedHashSet.add(user1);
		linkedHashSet.add(user2);
		print(hashSet);
		print(linkedHashSet);
	}

	public void print(Set<User> set) {
		for (User u : set) {
			System.out.println(u.name + "  " + u.surname + "  " + u.username + "  " + u.age);
			;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Task task = new Task();
		task.action1();
		task.action2();
	}
}