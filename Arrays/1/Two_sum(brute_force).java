package com.skakarla.problems;

public class Two_sum_bruteforce {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 3, 8, 9, 4 };
		int n = nums.length;
		int tar = 12;
		for (int i = 0; i < n; i++) {
			int first = nums[i];
			for (int j = i + 1; j < n; j++) {
				int sec = nums[j];
				int sum = first + sec;
				if (sum == tar) {
					System.out.println("The numbers are:"+nums[i]+","+nums[j]+".");
				}

			}
		}
	}

}

