package com.skakarla.problems;

import java.util.HashSet;

public class MissingNumberSolution {
    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        // Check which number in [0, n] is missing
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // This line should never be reached
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing number is: " + missingNumber(nums)); // Output: 2
    }
}

