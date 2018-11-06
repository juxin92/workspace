package com.juxin.collction;

import java.util.ArrayList;
import java.util.List;

public class My22_7 {
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int number = (int) (Math.random() * 10) + 1;
			myList.add(number);
		}
	}
}
