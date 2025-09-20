package com.skakarla.problems;

public class Check_if_all_integers_in_range_are_covered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ranges = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int left = 2, right = 5;

		int n = ranges.length;
		boolean res = false;
		for (int x = left; x <= right; x++) {
			for (int[] range : ranges) {
				if (x >= range[0] && x <= range[1]) {
					res = true;
				}
			}
		}
		if (!res) {
			res = false;
		}

		System.out.println(res);
	}

}
