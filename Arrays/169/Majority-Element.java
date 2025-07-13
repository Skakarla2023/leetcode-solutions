package com.skakarla.problems;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2, 1, 1, 1 };
		int n = nums.length;
		int freq = 0;
		int ans = 0;
		System.out.print("Majority Element is:");
		for (int i = 0; i < n; i++) {
			if (freq == 0) {
				ans = nums[i];
			}
			if (ans == nums[i]) {
				freq++;
			} else {
				freq--;
			}
		}

		System.out.println(ans);

	}

}
