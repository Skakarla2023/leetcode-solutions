package com.skakarla.problems;

public class Maximum_subarray_sum_Kadanes_Algorithm 
{
	public static void main(String[] args)
	{
		int[] arr= {3,-1,2,-6,7,8,-4,9};
		int n=arr.length;
		int curr_sum=0;
		for(int i=0;i<n;i++)
		{
			curr_sum+=arr[i];
			if(curr_sum<0)
			{
				curr_sum=0;
			}
		}
		System.out.print(curr_sum);
	}
}
