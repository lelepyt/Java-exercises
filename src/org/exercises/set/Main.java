//1)Set interface. You have create a small program, it's preferable that
//program has at least two classes. This program should demonstrate usage
//of 3 implementations of the Set interface. You can use String objects to
//for storing in the collection.
//2)Set interface continue. Using the previous example you have to try to 
//store NULL in each Set implementation.
package org.exercises.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //HashSet contains objects without saving their order, but has the highest performance
        MySet hashSet = new MySet();
        hashSet.setSet(new HashSet());
        hashSet.addElements();
        hashSet.toString();

        //TreeSet contains objects in sorted order, but has the lowest performance
        MySet treeSet = new MySet();
        treeSet.setSet(new TreeSet());
        treeSet.addElements();
        treeSet.toString();

        //LinkedHashSet contains objects with saving their order of adding in the list, but has lower performance than HashSet
        MySet linkedHashSet = new MySet();
        linkedHashSet.setSet(new LinkedHashSet());
        linkedHashSet.addElements();
        linkedHashSet.toString();

        hashSet.set.clear();
        hashSet.addNULLs();
        hashSet.toString();

        treeSet.set.clear();
        treeSet.addNULLs();
        treeSet.toString();

        linkedHashSet.set.clear();
        linkedHashSet.addNULLs();
        linkedHashSet.toString();
    }
}
