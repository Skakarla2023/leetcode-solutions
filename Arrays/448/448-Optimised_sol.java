package com.skakarla.problems;

import java.util.ArrayList;
import java.util.List;

public class Find_Disappeared_nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int n = nums.length;

		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}

		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				res.add(i + 1);
			}
		}

		for (int num : res) {
			System.out.println(num);
		}

	}

}
