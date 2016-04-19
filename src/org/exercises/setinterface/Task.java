/*Set interface. You have to have a class User with fields like
 *  (username, age or something like that ). This class you have
 *   to use to create objects for storing in the Set collection. 
 *   For Set implementation you have to use TreeMap. You have to 
 *   store in the collection 10 objects. Then you should create 2 
 *   similar objects as are present in the collection 
 *   (same username, age etc) and try to store them in the collection.
 *    Accordingly the collection should not allow you to store the duplicates.
 */
package org.exercises.setinterface;

import java.util.Set;
import java.util.TreeSet;

public class Task {
	TreeSet<User> treeSet = new TreeSet<User>(User.getNameComparator());

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
		addElements(treeSet);
		print(treeSet);
	}

	public void action2() {
		User user1 = new User("Volodya", "Zhemevko", "lelepyt", 19);
		User user2 = user1;
		treeSet.clear();
		treeSet.add(user1);
		treeSet.add(user2);
		print(treeSet);
	}

	public void print(Set<User> set) {
		for (User u : set) {
			System.out.println(u.name + "  " + u.surname + "  " + u.username + "  " + u.age);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Task task = new Task();
		task.action1();
		task.action2();
	}
}
