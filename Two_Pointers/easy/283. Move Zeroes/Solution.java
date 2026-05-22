import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        int k = 0;

        // use two pointers
        // one pointer should be used to update the non-zero elements of the array
        // another pointer should be used to traverse the array and find the non-zero elements.

        while (k < n && j < n) {
            if (nums[j] == 0) {
                j++;
            } else {
                nums[k] = nums[j];
                j++;
                k++;
            }
        }

        while (k < n) {
            nums[k] = 0;
            k++;
        }

    }
}
