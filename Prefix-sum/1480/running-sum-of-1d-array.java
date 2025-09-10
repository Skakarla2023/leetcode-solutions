   package com.skakarla.problems;

public class Running_sum_of_1D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5 };

		Running_sum_of_1D_array obj = new Running_sum_of_1D_array();

		obj.running_sum(nums);

	}

	public void running_sum(int[] nums) {
		// TODO Auto-generated method stub
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i];
		}

		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

}
