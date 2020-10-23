package com.coforge.jay;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
		TreeSet<Integer> integers = new TreeSet<>(new MyComparator());
		integers.add(10);
		integers.add(2);
		integers.add(21);
		integers.add(0);
		System.out.println(integers);
		TreeSet<String> strings = new TreeSet<>(new MyStringComparator());
		strings.add("RD");
		strings.add("DR");
		strings.add("VG");
		strings.add("PG");
		System.out.println(strings);
		
		
	}
}
