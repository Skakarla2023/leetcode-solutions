package com.skakarla.problems;

public class Good_Substrings_of_length_3_Brute_Force {

	public static void main(String[] args) {
		String s = "xyzzaz";
		int n = s.length();
		int count = 0;

		for (int i = 0; i <= n - 3; i++) {
			char a = s.charAt(i);
			char b = s.charAt(i + 1);
			char c = s.charAt(i + 2);

			if (a != b && b != c && a != c) {
				count++;
			}
		}

		System.out.println(count);

	}

}
