package com.skakarla.problems;

public class Remove_Duplcates_from_sorted_Array {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 1, 2, 3, 3, 4 };
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				count++;
			}
		}
		count += 1;
		int[] unique = new int[count];
		unique[0] = nums[0];
		int idx = 1;
		for (int i = 1; i < n; i++) {
			if (nums[i] != nums[i - 1]) {
				unique[idx++] = nums[i];
			}
		}

		for (int i : unique) {
			System.out.println(i);
		}
	}

}
