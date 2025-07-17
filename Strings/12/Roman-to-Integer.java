package com.skakarla.problems;

import java.util.HashMap;
import java.util.Map;

public class Roman_To_Integer {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		int n = s.length();

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int total = 0;
		for (int i = 0; i < n; i++) {
			int value = map.get(s.charAt(i));

			if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				total -= value;
			} else {
				total += value;
			}
		}

		System.out.println(total);

	}

}
