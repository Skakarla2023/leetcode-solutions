import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        for(int i:nums) {
            set.add(i);
        }

        for(int i=1;i<=n;i++) {
            if(!set.contains(i)) {
                return i;
            }
        }

        set.clear();
        return n+1;
    }
}
