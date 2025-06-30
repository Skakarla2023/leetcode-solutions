package com.skakarla.problems;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum_Optimised {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 3, 8, 9, 4 };
        int target = 12;

        int[] result = two_sum(nums, target);

        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] two_sum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int first = nums[i];
            int second = target - first;

            if (map.containsKey(second)) {
                return new int[] { map.get(second), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; 
    }
}
