package com.skakarla.problems;

import java.util.Arrays;

public class Longest_Harmonious_Subsequence {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
		int n = nums.length;
		Arrays.sort(nums);
		int left = 0, right = 1;
		int result = 0;
		while (right < nums.length) {
			int diff = nums[right] - nums[left];
			if (diff == 1) {
				result = Math.max(result, right - left + 1);
			}
			if (diff <= 1) {
				right++;
			} else {
				left++;
			}
		}
		System.out.println(result);
	}

}
