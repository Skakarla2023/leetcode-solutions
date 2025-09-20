package com.skakarla.problems;

public class Maximum_score_after_splitting_a_string {
	public static void main(String[] args) {
		String s = "00111011";
		int n = s.length();

		int[] nums = new int[s.length()];
		for (int i = 0; i < n; i++) {
			nums[i] = s.charAt(i) - '0';
		}

		int[] prefix = new int[n];
		prefix[0] = nums[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + nums[i];
		}

		int zeroes = 0, maxscore = 0;
		int ones = prefix[n - 1];
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] == 0) {
				zeroes++;
			} else {
				ones--;
			}
			maxscore = Math.max(maxscore, ones + zeroes);
		}

		System.out.println(maxscore);
	}
}
