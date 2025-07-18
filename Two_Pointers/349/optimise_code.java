package com.skakarla.problems;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_2_arrays_2 {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();

		for (int i : nums1) {
			set.add(i);
		}

		for (int i : nums2) {
			if (set.contains(i)) {
				result.add(i);
			}
		}

		int[] res = new int[result.size()];
		int k = 0;

		for (int i : result) {
			res[k++] = i;
		}

		for (int i : res) {
			System.out.println(i);
		}
	}

}
