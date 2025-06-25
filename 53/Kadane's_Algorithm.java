package com.skakarla.problems;

public class Maximum_subarray_sum_Kadanes_Algorithm 
{
	public static void main(String[] args)
	{
		int max_sum=Integer.MIN_VALUE;
		int[] arr= {3,-1,2,-6,7,8,-4,9};
		int n=arr.length;
		int curr_sum=0;
		for(int i=0;i<n;i++)
		{
			curr_sum=Math.max(arr[i],curr_sum+arr[i]);
			max_sum=Math.max(curr_sum, max_sum);
		}
		System.out.print(curr_sum);
	}
}
