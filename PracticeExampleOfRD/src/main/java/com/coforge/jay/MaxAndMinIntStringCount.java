package com.coforge.jay;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinIntStringCount {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rameshwar","Gholap");
		String string = list.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(string);
		List<Integer> listInt = Arrays.asList(10,23,43,12);
		Integer max = listInt.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(max);
		Integer min = listInt.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(min);
		
	}
}
