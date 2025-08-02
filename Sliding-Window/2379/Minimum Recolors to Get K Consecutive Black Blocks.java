package com.skakarla.problems;

public class Blocks_W_B {

	public static void main(String[] args) {
		
		String str = "WBBWWBBWBW";
		int k = 7;

		Blocks_W_B obj = new Blocks_W_B();
		System.out.println(obj.findminwhite(str, k));

	}

	private int findminwhite(String str, int k) {

		int whiteCount = 0;
		int minWhite = Integer.MAX_VALUE;

		for (int i = 0; i < k; i++) {
			if (str.charAt(i) == 'W') {
				whiteCount++;
			}
		}

		minWhite = whiteCount;

		for (int i = k; i < str.length(); i++) {
			if (str.charAt(i - k) == 'W') {
				whiteCount--;
			}
			if (str.charAt(i) == 'W') {
				whiteCount++;
			}
			minWhite = Math.min(minWhite, whiteCount);
		}

		return minWhite;
	}

}
