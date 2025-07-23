package com.skakarla.problems;

import java.util.HashMap;
import java.util.Map;

public class Contains_DuplicateII {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		System.out.println(containsDuplicate(nums, k));
	}

	public static boolean containsDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], i);
			} else {
				int pastIndex = map.get(nums[i]);
				// Get the previous index of the same number
				if ((i - pastIndex) <= k) {
					return true;
				} else {
					map.put(nums[i], i);
				}
			}
		}
		return false;

	}
}
