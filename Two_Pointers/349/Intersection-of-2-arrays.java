package com.skakarla.problems;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_2_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		int n1 = nums1.length;
		int n2 = nums2.length;

		Set<Integer> result = new HashSet<>();
		int i = 0, j = 0;

		while (i < n1 && j < n2) {
			if (nums1[i] == nums2[j]) {
				result.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}

		int k = 0;
		int[] res = new int[result.size()];
		for (int num : result) {
			res[k++] = num;
		}

		for (int a : res) {
			System.out.println(a);
		}

	}

}
