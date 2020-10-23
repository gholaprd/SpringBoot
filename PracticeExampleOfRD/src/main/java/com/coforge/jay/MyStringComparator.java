package com.coforge.jay;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//o1.compareTo(o2); //Asc
				return -o1.compareTo(o2); //Descßß
	}

}
