package com.xworkz.collectionconcept.streetdto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StreetDTOTester {

	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		name.add("Banneraghatta");
		name.add("Jalahalli");
		name.add("RTNagar");
		name.add("Jayanagar");
		name.add("Banashankari");
		name.add("Peenya");

		System.out.println(name);

		List<Integer> pincode = new ArrayList<Integer>();
		pincode.add(50093);
		pincode.add(50094);
		pincode.add(50095);
		pincode.add(50096);
		pincode.add(50097);
		pincode.add(50098);

		System.out.println(pincode);

		List<String> landMark = new ArrayList<String>();
		landMark.add("Yelahanka");
		landMark.add("Marathahalli");
		landMark.add("BasaveshwarNagar");
		landMark.add("VijayaNagar");
		landMark.add("Kengeri");
		landMark.add("RajajiNagar");
		System.out.println(landMark);

		List<String> city = new ArrayList<String>();
		city.add("Bangalore");
		city.add("Bangalore");
		city.add("Bangalore");
		city.add("Bangalore");
		city.add("Bangalore");
		city.add("Bangalore");

		System.out.println(city);
		System.out.println(city.size());

		System.out.println(pincode.get(5));

		int indexofKengeri = landMark.indexOf("Kengeri");
		System.out.println("Kengeri : " + indexofKengeri);

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
		ListIterator<String> itr1 = landMark.listIterator(3);
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
		name.addAll(landMark);
		city.addAll(name);
		System.out.println(name.size());
		System.out.println(city);

		System.out.println("sort ");
		Collections.sort(name);
		System.out.println(name);

		System.out.println("ContainsAll");
		city.containsAll(name);
		System.out.println(city);
		System.out.println(name);

		System.out.println("RetailAll");
		name.retainAll(landMark);
		System.out.println(name);

		System.out.println("RemoveAll");
		name.removeAll(city);
		System.out.println(name);
		System.out.println(name.size());

	}

}
