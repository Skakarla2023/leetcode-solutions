package leetcode_programs_updated;

import java.util.*;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = { -2, 4, 2, -1, 0, 1, 1, -1 };
		Arrays.sort(nums);
		int target = 0;

		System.out.println(foursum(nums, target));
	}

	private static List<List<Integer>> foursum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int left = j + 1;
				int right = nums.length - 1;

				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						left++;
						right--;

						while (left < right && nums[left] == nums[left + 1]) {
							left++;
						}

						while (left < right && nums[right] == nums[right - 1]) {
							right--;
						}
					} else if (sum < 0) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return result;
	}

}
