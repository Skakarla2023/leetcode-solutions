package com.skakarla.problems;

public class Move_Zeroes 
{
	public static void main(String[] args) 
	{
		int[] nums= {0,1,0,3,7,12};
		int n=nums.length;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(nums[i]!=0)
			{
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				j++;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
