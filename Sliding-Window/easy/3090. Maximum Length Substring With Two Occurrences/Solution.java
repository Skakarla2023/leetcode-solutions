class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int len = 0;
        int max_len = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            while (freq.get(ch) > 2) {
                char a = s.charAt(left);
                int newFreq = freq.get(a) - 1;
                if (freq.get(a) == 0) {
                    freq.remove(a);
                } else {
                    freq.put(a, newFreq);
                }
                left++;

            }
            len = right - left + 1;
            max_len = Math.max(len, max_len);
        }
        return max_len;
    }
}
