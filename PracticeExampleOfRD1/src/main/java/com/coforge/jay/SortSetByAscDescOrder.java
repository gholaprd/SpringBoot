package com.coforge.jay;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SortSetByAscDescOrder {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(2);
		set.add(21);
		set.add(0);
		TreeSet<String> set1 = new TreeSet<>();
		set1.add("jay");
		set1.add("rd");
		NavigableSet<String> descendingSet2 = set1.descendingSet();
		//descending order string
		System.out.println(descendingSet2);
		//ascending order String
		System.out.println(set1);
		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println(descendingSet);
		System.out.println(set);
	}
}
