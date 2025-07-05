package com.skakarla.problems;

import java.util.Arrays;

public class Plus_One 
{
	
	public int[] plusOne(int[] digits) 
    {
        int res=0;
        for (int i = digits.length - 1; i >= 0; i--) 
        {
		    if (digits[i] < 9) 
            {
		    	digits[i]++;
		        return digits;  
		    }
		    digits[i] = 0; 
		}

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;     
    }	
	
	public static void main(String[] args) 
	{
		int[] nums= {9,8,7,6,5,4,3,2,1,0};
		Plus_One myobj=new Plus_One();
		System.out.println(Arrays.toString(myobj.plusOne(nums)));
	}
}
	
