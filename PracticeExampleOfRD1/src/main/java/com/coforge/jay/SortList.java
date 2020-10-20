package com.coforge.jay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(8);
		Collections.sort(list);
		System.out.println(list);
		//ascending order
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		//descending order
		list.sort(Comparator.reverseOrder());
		System.out.println(list);

	}

}
