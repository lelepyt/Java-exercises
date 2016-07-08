package org.exercises.lists.tosringlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

// List. You have to write a small program which will have three methods.
// Each of the methods will iterate through the list and print the results
// using the toString method, the approaches should be different in each method.
// One of them should use Java 8 feature. Values should be objects of your custom class
// (a class which you created). You can use one of your previous programs and add those methods to it.
//
// List continue. You have to add two methods which will iterate through the list and
// remove only those objects from the list which meet certain criteria, like some
// fields have some value or something like that. Each method should do it differently.
// One of the should use Java 8 feature from the Collections class.
public class Start {

	List<User> list = new ArrayList<>();

	public static void main(String[] args) {
		Start start = new Start();
		start.addElements();
		start.iterateWithForeach();
		start.iterateWithIterator();
		start.iterateWithLambda();
		int ageToBeRemoved = 20;
		start.remove_1(ageToBeRemoved);
		start.list.clear();
		start.addElements();
		start.remove_2(ageToBeRemoved);
	}

	public void addElements() {
		String[] names = { "Volodya", "Taras", "Andriy", "Tolik", "Vova", "Vitalik", "Roma", "Andriy", "Kyryll",
				"Olexandr" };
		String[] surnames = { "Zhemevko", "Shunkaryk", "Kuklyak", "Danulchenko", "Corniy", "Lotockiy", "Kryckiy",
				"Dubyk", "Postynak", "Lopatun" };
		String[] usernames = { "lelepyt", "limosha", "manchester", "tolik", "corniy", "vitalya", "romaroma", "andruha",
				"karho", "lopata", };
		Integer[] age = { 19, 20, 20, 20, 20, 20, 20, 22, 21, 21 };

		for (int i = 0; i < 10; i++) {
			list.add(new User(names[i], surnames[i], usernames[i], age[i]));
		}
	}

	public void iterateWithForeach() {
		System.out.println("*****				Iterate list with foreach 			*****");
		for (User user : list) {
			System.out.println(user);
		}
	}

	public void iterateWithIterator() {
		System.out.println("*****				Iterate list with iterator 				 *****");
		Iterator<User> iterator = list.iterator();
		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
	}

	public void iterateWithLambda() {
		System.out.println("*****				Iterate list with lambda				  *****");
		list.forEach((User user) -> {
			System.out.println(user);
		});
	}

	public void remove_1(Integer age) {
		System.out.println("*****						Remove_1						  *****");
		list.stream().filter(user -> user.getAge() == age).forEach(u -> list.remove(u));
		iterateWithLambda();
	}

	public void remove_2(Integer age) {
		System.out.println("*****						Remove_2						  *****");
		Iterator<User> iterator = list.iterator();
		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			if (user.getAge() == age) {
				iterator.remove();
			}
		}
		iterateWithLambda();
	}
}