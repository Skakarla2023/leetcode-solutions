class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int[] letters = new int[26];
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            char curr = s.charAt(right);
            letters[curr - 'A']++;

            maxFreq = Math.max(maxFreq, letters[curr - 'A']);

            if ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                letters[leftChar - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;
    }
}
