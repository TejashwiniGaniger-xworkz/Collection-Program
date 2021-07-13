package com.xworkz.collectionconcept.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PersonTester {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("teju");
		name.add("sahana");
		name.add("rakshita");
		name.add("anusha");
		System.out.println(name);
		
		List<Integer> age = new ArrayList<Integer>();
        age.add(22);
        age.add(24);
        age.add(21);
        age.add(23);
        System.out.println(age);
        
		List<String> designation = new ArrayList<String>();
		designation.add("Tester");
		designation.add("Developer");
		designation.add("BI");
		designation.add("Admin");
		System.out.println(designation);
		
		List<String> location = new ArrayList<String>();
		location.add("Bangalore");
		location.add("Chanai");
		location.add("Hyderbad");
		location.add("Dehli");
		System.out.println(location);
		
		System.out.println(location.size());
		
		int indexofHyderabad = location.indexOf("Hyderbad");
		System.out.println("Hyderbad : " + indexofHyderabad);
		
		ListIterator<String> itr = name.listIterator(2);
		System.out.println("Itr index :" + itr.nextIndex());
		while (itr.hasPrevious()) {
			String e = itr.previous();
			System.out.println(e);
		}

		System.out.println("**********");
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}
		System.out.println("-------------------");
		ListIterator<String> itr1 = location.listIterator(3);
		System.out.println("Itr1 index : " + itr1.nextIndex());
		while (itr1.hasPrevious()) {
			String s = itr1.previous();
			System.out.println(s);
		}

		System.out.println("*************");
		while (itr1.hasNext()) {
			String str = itr1.next();
			System.out.println(str);
		}

		System.out.println("AddAll");
		name.addAll(location);
		
		System.out.println(name.size());
		System.out.println(name);

		System.out.println("sort ");
		Collections.sort(name);
		System.out.println(name);

		System.out.println("ContainsAll");
		location.containsAll(name);
		
		System.out.println(location);

		System.out.println("RetailAll");
		name.retainAll(location);
		System.out.println(name);

		System.out.println("RemoveAll");
		name.removeAll(location);
		System.out.println(name);
		System.out.println(name.size());

	}

}
