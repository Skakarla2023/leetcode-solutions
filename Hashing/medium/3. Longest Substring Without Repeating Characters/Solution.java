import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String str) {
        int n = str.length();
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen  = 0;

        for(int right = 0; right<n;right++) {
            while(set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
