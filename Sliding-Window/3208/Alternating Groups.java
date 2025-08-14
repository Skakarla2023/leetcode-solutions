package com.skakarla.problems;

public class Alternating_Groups {

	public static void main(String[] args) {
		int[] colors = { 1, 0, 1, 0, 0 };
		Alternating_Groups obj = new Alternating_Groups();
		System.out.println(obj.findAlternatingGroup(colors));
	}

	private int findAlternatingGroup(int[] colors) {
		int n = colors.length;
		int count = 1;
		int ans = 0;
		int k = 3;

		for (int i = 1; i < n * 2; i++) {
			if (colors[i % n] != colors[(i - 1) % n]) {
				count++;
			} else {
				count = 1;
			}

			if (count >= k && i - k + 1 < n) {
				ans++;
			}
		}
		return ans;
	}

}
