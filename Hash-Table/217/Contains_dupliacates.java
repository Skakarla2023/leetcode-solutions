package com.skakarla.problems;

import java.util.Arrays;

public class Contains_duplicate 
{
	public static void main(String[] args) 
	{
		int[] nums = { 1, 3, 4, 2, 1 };
		int n = nums.length;

		Arrays.sort(nums);
		for (int i = 0; i < n - 1; i++) 
		{
			if (nums[i] == nums[i + 1]) 
			{
				System.out.println(true);
				return;// Duplicate found
			}

		}
		System.out.println(false);
	}

}


