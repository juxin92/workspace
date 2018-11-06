package com.juxin.exercise;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise22_1 {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>(
				Arrays.asList(new String[] { "George", "Jim", "John", "Blake", "Kevin", "Michael" }));

		HashSet<String> set1Clone1 = (HashSet<String>) set1.clone();
		HashSet<String> set1Clone2 = (HashSet<String>) set1.clone();

		HashSet<String> set2 = new HashSet<String>(
				Arrays.asList(new String[] { "George", "Katie", "Kevin", "Michelle", "Ryan" }));

		set1.addAll(set2);
		set1Clone1.removeAll(set2);
		set1Clone2.retainAll(set2);

		System.out.println("The union of the two sets is " + set1);
		System.out.println("The difference of the two sets is " + set1Clone1);
		System.out.println("The intersection of the two sets is " + set1Clone2);
	}
}
