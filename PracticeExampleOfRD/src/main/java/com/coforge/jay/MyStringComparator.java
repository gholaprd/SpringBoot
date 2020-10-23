package com.coforge.jay;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

}
