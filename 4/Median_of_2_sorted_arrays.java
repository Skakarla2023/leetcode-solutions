package com.skakarla.problems;

import java.util.Arrays;

public class Median_of_2_sorted_arrays {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };

		Median_of_2_sorted_arrays obj = new Median_of_2_sorted_arrays();

		System.out.println(obj.findMedianSortedArrays(nums1, nums2));
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		int n = n1 + n2;
		int[] c = new int[n];

		for (int i = 0; i < n1; i++) {
			c[i] = nums1[i];
		}

		for (int i = 0; i < n2; i++) {
			c[n1 + i] = nums2[i];
		}

		Arrays.sort(c);

		double med = 0;

		if (n % 2 == 0) {
			med = (c[n / 2] + c[n / 2 - 1]) / 2.0;
		} else {
			med = c[n / 2];
		}

		return med;

	}
}
