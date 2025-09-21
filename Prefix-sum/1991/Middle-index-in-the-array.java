package com.skakarla.problems;

public class Middle_Index_In_the_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, -1, 8, 4 };
		int n = nums.length;

		int ind = 0;
		int[] prefix = new int[n];
		prefix[0] = nums[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + nums[i];
		}

		for (int i = 0; i < n; i++) {
			int leftsum = (i == 0 ? 0 : prefix[i - 1]);
			int rightsum = prefix[n - 1] - prefix[i];
			if (leftsum == rightsum) {
				System.out.println(i);
				return;
			}

		}

		System.out.println("-1");

	}

}
