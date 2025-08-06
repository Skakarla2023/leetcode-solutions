package com.skakarla.problems;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character_In_A_String {

	public static void main(String[] args) {
		String s = "leetcode";
		First_Unique_Character_In_A_String obj = new First_Unique_Character_In_A_String();
		System.out.println(obj.findUniqueChar(s));

	}

	public int findUniqueChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}

}
