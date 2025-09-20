package com.skakarla.problems;

public class Maximum_population_year {
	public static void main(String[] args) {
		int[][] logs = { { 1993, 1999 }, { 2000, 2010 } };
		int[] years = new int[101];

		for (int i = 0; i < logs.length; i++) {
			int birth = logs[i][0];
			int death = logs[i][1];

			years[birth - 1950]++;
			years[death - 1950]--;
		}

		int[] prefix = new int[101];
		prefix[0] = years[0];
		for (int i = 1; i < years.length; i++) {
			prefix[i] = prefix[i - 1] + years[i];
		}

		int max = 0;
		int year = prefix[0];

		for (int i = 0; i < prefix.length; i++) {
			if (prefix[i] > max) {
				max = prefix[i];
				year = 1950 + i;
			}
		}

		System.out.println(year);
	}
}
