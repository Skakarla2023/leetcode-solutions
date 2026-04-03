import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int start = 0, end = n - 1;

        if (n == 1 && nums[n - 1] == val) {
            return 0;
        }

        while (start <= end) {
            if (nums[start] == val) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            } else {
                start++;
            }
        }

        if (start == end - 1) {
            return 0;
        } else {
            return start;
        }
    }
}
