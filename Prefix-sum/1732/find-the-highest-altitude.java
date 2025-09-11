package com.skakarla.problems;

public class Highest_Altitude {
	public static void main(String[] args) {
		int[] gain = new int[] { -5, 1, 5, 0, -7 };
		System.out.println(largestAltitude(gain));
	}

	public static int largestAltitude(int[] gain) {
		int altitude = 0;
		int maxAltitude = 0;

		for (int g : gain) {
			altitude += g;
			maxAltitude = Math.max(maxAltitude, altitude);
		}

		return maxAltitude;
	}
}
