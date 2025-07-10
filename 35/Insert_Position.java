package com.skakarla.problems;

import java.util.Scanner;

public class Insert_Position {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 5, 6 };
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter target value:");
		int target = obj.nextInt();
		Insert_Position myobj = new Insert_Position();
		System.out.println(myobj.find_ins_pos(nums, target));

	}

	private static int find_ins_pos(int[] nums, int target) {
		int n = nums.length;
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] >= target) {
				idx = i;
				return i;
			}
			idx = n;
		}
		return idx;
	}

}
