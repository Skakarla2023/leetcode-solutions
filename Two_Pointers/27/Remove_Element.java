package com.skakarla.problems;

import java.util.Scanner;

public class Remove_Element 
{
	public static void main(String[] args)
	{
		int[] nums= {2,3,3,2};
		int n=nums.length;
		int[] arr=new int[n];
		
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter value to remove:");
		int val=obj.nextInt();
		int idx=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(nums[i]!=val)
			{
				count++;
				arr[idx++]=nums[i];
			}
		}
		System.out.println("Number of elements not equal to val:"+count);
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}
}

