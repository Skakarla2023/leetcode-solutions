package com.skakarla.problems;

public class Container_with_most_water {

	public static void main(String[] args) {

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int n = height.length;

		int i = 0;
		int j = n - 1;
		int maxarea = 0;
		while (i <= j) {
			int width = j - i;
			int min_height = Math.min(height[i], height[j]);

			int area = (width * min_height);
			maxarea = Math.max(maxarea, area);

			if (height[i] > height[j]) {
				j--;
			} else {
				i++;
			}

		}

		System.out.println(maxarea);

	}

}
