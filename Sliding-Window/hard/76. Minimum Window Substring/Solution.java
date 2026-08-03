class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        int[] curr = new int[128];

        if (s.length() < t.length()) {
            return "";
        }

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }

        int need = 0;
        for (int count : freq) {
            if (count > 0) {
                need++;
            }
        }

        int have = 0;
        int size = 0;
        int minSize = Integer.MAX_VALUE;
        String ans = "";
        int left = 0;
        int startIdx = 0;

        for (int right = 0; right < s.length(); right++) {
            char rchar = s.charAt(right);
            curr[rchar]++;

            if (freq[rchar] > 0 && curr[rchar] == freq[rchar]) {
                have++;
            }

            while (have == need) {
                size = right - left + 1;

                if (size < minSize) {
                    minSize = size;
                    startIdx = left;
                }

                char lchar = s.charAt(left);
                if (freq[lchar] > 0 && curr[lchar] == freq[lchar]) {
                    have--;
                }

                curr[lchar]--;
                left++;
            }

        }

        return minSize == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minSize);
    }
}
