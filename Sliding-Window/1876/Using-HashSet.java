package com.skakarla.problems;

import java.util.HashSet;
import java.util.Set;

public class L1876_HashSet {

	public static void main(String[] args) {
		String s = "aababcabc";
		int n = s.length();
		int count = 0;

		for (int i = 0; i <= n - 3; i++) {
			Set<Character> set = new HashSet<>();
			set.add(s.charAt(i));
			set.add(s.charAt(i + 1));
			set.add(s.charAt(i + 2));

			if (set.size() == 3) {
				count++;
			}
		}

		System.out.println(count);

	}

}
