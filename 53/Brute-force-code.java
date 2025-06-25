package com.skakarla.problems;

public class Maximum_subarray_sum {

	public static void main(String[] args) 
	{
		int max_sum = Integer.MIN_VALUE;
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		
		for (int st = 0; st < n; st++)
		{
			int curr_sum = 0;
			for (int end = 0; end < n; end++) 
			{
				curr_sum += arr[end];
				max_sum = Math.max(curr_sum, max_sum);
			}
		}
		System.out.println(max_sum);
	}

}
