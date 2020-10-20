package com.coforge.jay;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortMapByKey {

	public static void main(String[] args) {
		NavigableMap<String, Integer> unsortMap = new TreeMap<>();
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(1, "RD");
		String put = map1.put(1, "Jay");
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println("Original...");
		System.out.println(unsortMap);

		// sort by keys, a,b,c..., and return a new LinkedHashMap
		// toMap() will returns HashMap by default, we need LinkedHashMap to keep the
		// order.
		Map<String, Integer> result = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		System.out.println(result);
		
		// descending treemap by key
		System.out.println(unsortMap.descendingMap());

	}
}
