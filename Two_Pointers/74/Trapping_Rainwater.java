package com.skakarla.problems;

public class Trapping_Rainwater {

    public int trap(int[] height) {
        int n = height.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        int ans = 0;

        // Fill lmax[]: max height to the left of each bar
        lmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], height[i]);
        }

        // Fill rmax[]: max height to the right of each bar
        rmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], height[i]);
        }

        // Calculate total trapped water
        for (int i = 0; i < n; i++) {
            ans += Math.min(lmax[i], rmax[i]) - height[i];
        }

        return ans;
    }

    // Optional: Add main method to test
    public static void main(String[] args) {
        Trapping_Rainwater sol = new Trapping_Rainwater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = sol.trap(height);
        System.out.println("Trapped water: " + result); // Output: 6
    }
}
