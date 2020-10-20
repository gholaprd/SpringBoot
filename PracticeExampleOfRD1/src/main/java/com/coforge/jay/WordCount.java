package com.coforge.jay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		
		String str = "abc,abc,xzy,abc";
		String[] strs = str.split(",");
		Map<String, Integer> map = new HashMap<String, Integer>();

		//Arrays.stream(strs).collect((Collectors.groupingBy(x->x,Collectors.counting())); //In java 10
		for (String st : strs) {
			Integer cont = map.get(st);
			if (cont == null) {
				cont = 0;
			}
			map.put(st, cont+1);
		}
		System.out.println(map);
		
		HashMap<String, Integer>map1 = new  HashMap<>();
		map1.put("A", new Integer(20));
		map1.put("B", new Integer(1));
		map1.remove(new String("B"));
		System.out.println(map1);
		
		List<Integer>listA=new ArrayList<>();
		listA.add(2);
		listA.add(3);
		List<Integer> listB=listA;
		List<Integer> listC=new ArrayList<>(listB);
		listB.add(4);
		listC.add(4);
		listA.clear();
		
		System.out.println(listA);
		System.out.println(listB);
		System.out.println(listC);
	}

}
