package com.juxin.exercise;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		String myLuck = "03,04,09,18,22,24,07";
		String luck = luckString(randomOfSet());
		int i = numberOfLuck(myLuck, luck);
		System.out.println(i + "\t" + myLuck + "\tgoodluck");
	}

	/*
	 * 六个红，从小到大排列.
	 */
	public static Set<String> randomOfSet() {
		Set<String> mySet = new TreeSet<>();
		while (mySet.size() < 6) {

			String ss = String.valueOf((int) (Math.random() * 33) + 1);
			if (ss.length() == 1) {
				ss = "0" + ss;
			}
			mySet.add(ss);
		}

		return mySet;
	}

	/*
	 * 六个红 + 一个蓝
	 */
	public static String luckString(Set<String> luckSet) {
		String ss = "";
		for (String s : luckSet) {
			ss += (s + ",");
		}
		String sss = String.valueOf((int) (Math.random() * 16) + 1);
		if (sss.length() == 1) {
			sss = "0" + sss;
		}
		ss += sss;
		return ss;
	}

	/*
	 * 中奖期数
	 */
	public static int numberOfLuck(String aa, String bb) {
		int i = 1;
		if (!aa.equals(bb)) {
			while (!aa.equals(bb)) {
				System.out.println(i + "\t" + bb + "\tno");
				bb = luckString(randomOfSet());
				i++;
			}
		}
		return i;
	}
}
