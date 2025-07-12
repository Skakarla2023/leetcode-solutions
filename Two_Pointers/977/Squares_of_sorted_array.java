package com.skakarla.problems;

public class Squares_of_sortedarray {

	public static void main(String[] args) {
		int[] nums= {-4,-1,0,3,10};
		int[] new_one=sorted_squares(nums);
		System.out.println("The sorted array is:");
		for(int i:new_one) {
			System.out.print(i+" ");
		}
	}

	private static int[] sorted_squares(int[] nums) {
		
		int n=nums.length;
		int[] result=new int[n];
		
		int left=0;		//pointer at the beginning
		int right=n-1;	//pointer at the end
		int pos=n-1;		//pointer to add the larest value to the result(new) array
		
		while(left<=right) {
			int rightsquare=nums[right]*nums[right];
			int leftsquare=nums[left]*nums[left];
			
			if(rightsquare>leftsquare) {
				result[pos]=rightsquare;
				right--;
			}
			else {
				result[pos]=leftsquare;
				left++;
			}
			pos--;
		}
		return result;
		
	}

}
