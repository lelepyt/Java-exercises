package org.exercises.map.mapUser;

import java.util.*;
import java.util.Map.Entry;
//1) Map & HashMap. You have to have a class User which has a couple of fields (name, age, etc). 
//You have to have another class called UserDetails. This class also should have a couple of fields (married, address, phone number). 
//Then you have to create a couple of objects of that class( 5 or 10 or ...) and try to  save into a HashMap with the User class object as a key.

//2) Map & HashMap continue. You have to add a method or something like that which will try to store into
//the map two equal but not the same objects as keys. And demonstrate the results. For example print the map before and after.

//3)Map & HashMap continue. To the previous task, you have to add a method which going to  check if the given object is present as a 
//key in the HashMap. If  yes print that object is present and then remove it from the map. This should not be a loop.

//4)Map & HashMap continue. To the previous task, you have to add a method which going to  try to store a NULL as a key in the map

//5)Map & HashMap continue. You have to add three methods to the previous task. Each of them should iterate through the map and
//print key and values using the toString method. Probably you will need to overwrite 
//the toString method. Each method should use different approach. One of the approaches should use Java 8 feature.

//6)Map & HashMap continue. You have to add a method which will take a String parameter. That parameter 
//will be a username. You have to loop through the map and remove a user which has the given username 

public class Start {
	Map<User, UserDetails> hashMap = new HashMap<User, UserDetails>();
	public static void main(String[] args) {
		Start start = new Start();
		start.addElements();
		System.out.println(start.toString());
		start.checkingSameObjects();
		start.addSameObjects();
		start.saveNullInHashMap();
		start.addElements();
		start.iterateWithForeach();
		start.iterateWithIterator();
		start.iterateWithLambda();
		start.removeUser("lelepyt");
	}

	public void addElements() {
		String[] names = { "Volodya", "Taras", "Andriy", "Tolik", "Vova", "Vitalik", "Roma", "Andriy", "Kyryll",
							"Olexandr" };
		String[] surnames = { "Zhemevko", "Shunkaryk", "Kuklyak", "Danulchenko", "Corniy", "Lotockiy", "Kryckiy",
							"Dubyk", "Postynak", "Lopatun" };
		String[] usernames = { "lelepyt", "limosha", "manchester", "tolik", "corniy", "vitalya", "romaroma", "andruha",
							"karho", "lopata", };
		String[] age = { "19", "20", "20", "20", "20", "20", "20", "22", "21", "21" };
		// Start UserDetails fields
		String[] married = { "no", "yes", "no", "no", "yes", "no", "no", "yes", "yes", "yes", "no" };
		String[] address = { "Orlovskaya 12", "Green Avenue 16", "Ann Arbor 48", "West Road 433", "Lombard 45",
							"Kulparkivska 15", "Kulparkivska 18", "Losyara 16", "Kulparkivska 1", "Kulparkivska 75", "Kulparkivska 99" };
		String[] phoneNumber = { "2356", "22352121", "235351", "23452235", "253253", "5353545", "2345151", "53262",
							"251525", "2355252", "352152152" };
		for (int i = 0; i < 10; i++) {
			User user = new User(names[i], surnames[i], usernames[i], age[i]);
			UserDetails details = new UserDetails(married[i], address[i], phoneNumber[i]);
			hashMap.put(user, details);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Collection<UserDetails> list = (Collection<UserDetails>) hashMap.values();
		for (Object a : list) {
			if(a == null) {
				return "Map has null value, can not print";
			}
			sb.append("[married = ").append(((UserDetails)a).getMarried()).append("], [address = ")
				.append(((UserDetails)a).getAddress()).append("], [phoneNumber = ").append(((UserDetails)a).getPhoneNumber())
				.append("]\n");
		}
		return sb.toString();
	}

	//////////////////______2______///////////////////////////
	public void addSameObjects() {
		User user1 = new User("Volodya", "Zhemevko", "lelepyt", "19");
		UserDetails details1 = new UserDetails("no", "Orlovskaya 12", "2356");
		User user2 = new User("Volodya", "Zhemevko", "lelepyt", "19");
		UserDetails details2 = new UserDetails("no", "Orlovskaya 12", "2356");
		System.out.println("**********************two equal objects ******************************");
		hashMap.clear();
		System.out.println("first save");
		hashMap.put(user1, details1);
		System.out.println(this.toString());
		System.out.println("second  save");
		hashMap.put(user2, details2);
		System.out.println(this.toString());
		System.out.println(hashMap.size());
	}

	//////////////________3______/////////////////////////////
	public void checkingSameObjects() {
		User user = new User("Volodya", "Zhemevko", "lelepyt", "19");
		System.out.println("**********************checking same objects ******************************");
		boolean blnExists = hashMap.containsKey(user);
		if (blnExists == true) {
			System.out.println("User exists in HashMap");
			System.out.println(hashMap.get(user));
			hashMap.remove(user);
		}
		else {	System.out.println("User doesn't exist in HashMap");	}
	}

	///////////////________4________//////////////////
	public void saveNullInHashMap() {
		System.out.println("**********************save null in hashMap ******************************");
		User user = new User("Volodya", "Zhemevko", "lelepyt", "19");
		hashMap.clear();
		hashMap.put(user, null);
		hashMap.put(user, null);
		System.out.println(hashMap.get(user));
		System.out.println(hashMap.size());
		//System.out.println(this.toString());
	}

	////////////_________5_________///////////
	public void iterateWithForeach() {
		System.out.println("*********************iterate hashMap with foreach************************");
		Set<Map.Entry<User, UserDetails>> entrySet = hashMap.entrySet();
		for (Map.Entry<User, UserDetails> a : entrySet) {
			System.out.println("Key: " + a.getKey());
			System.out.println("Value: " + a.getValue());
		}
	}

	public void iterateWithIterator() {
		System.out.println("*********************iterate hashMap with iterator************************");
		Iterator<Entry<User, UserDetails>> entries = hashMap.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<?, ?> entry = entries.next();
			User key = (User)entry.getKey();
			UserDetails value = (UserDetails)entry.getValue();
			System.out.println("Key: " + key);
			System.out.println("Value: " + value);
		}
	}

	public void iterateWithLambda() {
		System.out.println("*********************iterate hashMap with lambda************************");
		Set<Map.Entry<User, UserDetails>> entrySet = hashMap.entrySet();
		entrySet.forEach((Map.Entry<User, UserDetails> entry) ->  {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		});
	}

	////////////_______6__________//////////////
	public void removeUser(String userName){
		System.out.println("**********************remove User from hashMap ******************************");
		for (User user : hashMap.keySet()) {
			if (user != null && user.getUsername().equals(userName)) {
				hashMap.remove(user);
			}
		}
		this.iterateWithForeach();
	}

























}
