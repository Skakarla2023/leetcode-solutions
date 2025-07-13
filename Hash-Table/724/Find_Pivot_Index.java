package com.skakarla.problems;

public class Find_Pivot_Index {

	public static void main(String[] args) {

		int[] nums = { 1, 4, 7, 4, 10, 2 };
		int n = nums.length;
		int totalsum = 0;
		for (int a : nums) {
			totalsum += a;
		}

		int leftsum = 0;
		for (int i = 0; i < n; i++) {
			int rightsum = totalsum - leftsum - nums[i];
			if (leftsum == rightsum) {
				System.out.println("pivot index:" + i);
			}
			leftsum += nums[i];

		}
	}
}
