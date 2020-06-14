package de.Christoph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> zahl = new ArrayList<Integer>();
		System.out.println(zahl.size());
		zahl.add(1);
		zahl.add(2);
		zahl.add(3);
		zahl.add(4);
		System.out.println(zahl.size());
		System.out.println(zahl.indexOf(3));
		System.out.println(zahl);
		List<Integer> zahl2 = new LinkedList<Integer>();
		zahl2 = zahl;
		System.out.println(zahl2);
		zahl2.add(2, 5);
		System.out.println(zahl2);
		System.out.println(zahl);
	}
}
