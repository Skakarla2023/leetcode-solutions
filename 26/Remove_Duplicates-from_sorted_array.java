package com.skakarla.problems;

public class Remove_Duplcates_from_sorted_Array {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 1, 2, 3, 3, 4 };
		int n = nums.length;
		int i = 0; // pointer to update the array elements
		// here we are going to use another pointer j to traverse through the array
		// elements
		for (int j = 1; j < n; j++) {
			if(nums[j]!=nums[i]) {
				i++;
				nums[i]=nums[j];
			}
		}
		int newlength=i+1;
		System.out.println("Length of the updated array:"+newlength);
		
		for(int a=0;a<newlength;a++) {
			System.out.println(nums[a]);
		}
	}

}
