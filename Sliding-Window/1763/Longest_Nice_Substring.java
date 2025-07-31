package com.skakarla.problems;

import java.util.HashSet;
import java.util.Set;

public class Longest_Nice_SubString {

	public static void main(String[] args) {
		String s = "YazaAay";
		int n = s.length();
		String res = "";
		for (int left = 0; left < n; left++) {
			Set<Character> set = new HashSet<>();
			for (int right = left; right < n; right++) {
				set.add(s.charAt(right));

				if (isNiceString(set)) {
					int len = right - left + 1;
					if (len > res.length()) {
						res = s.substring(left, right + 1);
					}
				}
			}
		}
		System.out.println(res);
	}

	private static boolean isNiceString(Set<Character> set) {
		for (char c : set) {
			if (Character.isLowerCase(c) && !set.contains(Character.toUpperCase(c))) {
				return false;
			}
			if (Character.isUpperCase(c) && !set.contains(Character.toLowerCase(c))) {
				return false;
			}
		}
		return true;
	}

}
