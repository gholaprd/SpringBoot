package com.coforge.jay;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		//o1.compareTo(o2); //Asc
		return -o1.compareTo(o2); //Descßß
	}

}
