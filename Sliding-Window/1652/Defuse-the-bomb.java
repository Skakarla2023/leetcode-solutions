package com.skakarla.problems;

public class Defuse_the_bomb {

	public static void main(String[] args) {

		int[] code = { 5, 4, 1, 7 };
		int n = code.length;
		int k = 3;

		int[] res = defuse(code, n, k);
		for (int i : res) {
			System.out.println(i);
		}
	}

	private static int[] defuse(int[] code, int n, int k) {
		// TODO Auto-generated method stub
		int[] result = new int[n];

		if (k == 0) {
			return result;
		}

		int windowSum = 0;

		if (k > 0) {
			for (int i = 1; i <= k; i++) {
				windowSum += code[i % n];
			}

			for (int i = 0; i < n; i++) {
				result[i] = windowSum;

				windowSum -= code[(i + 1) % n];
				windowSum += code[(i + 1 + k) % n];
			}
		}

		else {
			for (int i = 1; i <= k; i++) {
				windowSum += code[(n - i) % n];
			}

			for (int i = 0; i < n; i++) {
				result[i] = windowSum;

				windowSum -= code[(n + i - k) % n];
				windowSum += code[(n + i) % n];
			}
		}
		return result;

	}

}
