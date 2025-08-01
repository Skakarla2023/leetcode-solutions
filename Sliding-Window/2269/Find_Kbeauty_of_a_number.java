package com.skakarla.problems;

public class K_beauty_of_a_number {

	public static void main(String[] args) {

		K_beauty_of_a_number obj = new K_beauty_of_a_number();
		System.out.println(obj.findKbeauty(555, 1));

	}

	private int findKbeauty(int num, int k) {

		int l = 0, r = l + k;
		int count = 0;
		String s = Integer.toString(num);
		while (r <= s.length()) {
			String str = s.substring(l, r);
			int n = Integer.valueOf(str);
			if (num % n == 0) {
				count++;
				l++;
				r++;
			} else {
				l++;
				r++;
			}
		}

		return count;
	}

}
