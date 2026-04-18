import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int suffixProduct = 1;
            int prefixProduct = 1;

            int product = 1;
            for (int j = 0; j < i; j++) {
                prefixProduct *= nums[j];
            }
            for (int j = i + 1; j < n; j++) {
                suffixProduct *= nums[j];
            }
            product = suffixProduct * prefixProduct;
            list.add(product);
            i++;
        }

        int[] res = new int[list.size()];
        for (int a = 0; a < list.size(); a++) {
            res[a] = list.get(a);
        }

        return res;
    }
}
