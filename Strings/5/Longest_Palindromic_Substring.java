package leetcode_programs_updated;

import java.util.*;

public class Longest_Palindromic_Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = sc.next();
		System.out.println("Longest Palindromic substring:" + longestpal(str));
	}

	static String longestpal(String s) {
		int n = s.length();
		String pal = "";
		for (int i = 0; i < n; i++) {
			String even = palindrome(s, i, i + 1);

			String odd = palindrome(s, i, i);

			if (even.length() > pal.length()) {
				pal = even;
			}
			if (odd.length() > pal.length()) {
				pal = odd;
			}

		}
		return pal;
	}

	static String palindrome(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

}
