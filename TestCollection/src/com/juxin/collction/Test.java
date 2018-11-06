package com.juxin.collction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		String[] s = { "finally", "const", "finally", "int", "finally", "int", "aaa", "bbb", "", "  " };

		String[] keywordString = { "abstract", "finally", "public", "boolean", "float", "return", "break", "for",
				"short", "byte", "goto", "static", "case", "if", "super", "catch", "implements", "switch", "char",
				"import", "synchronized", "class", "instanceof", "this", "const", "int", "throw", "continue",
				"interface", "throws", "default", "long", "transient", "do", "native", "try", "double", "new", "void",
				"else", "package", "volatile", "extends", "private", "while", "final", "protected", "true", "null" };

		Set<String> set1 = new HashSet<>(Arrays.asList(keywordString));
		Map<String, Integer> map1 = new TreeMap<>();

		for (String key : s) {
			if (set1.contains(key)) {
				if (map1.get(key) == null) {
					map1.put(key, 1);
				} else {
					int value = map1.get(key).intValue();
					value++;
					map1.put(key, value);
				}
			}
		}

		Set<Map.Entry<String, Integer>> set2 = map1.entrySet();
		for (Map.Entry<String, Integer> set22 : set2)
			System.out.println(set22.getKey() + "\t" + set22.getValue());
	}
}
