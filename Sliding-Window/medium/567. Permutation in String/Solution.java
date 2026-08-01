import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int n1 = s1.length();
        int n2 = s2.length();

        int[] s1Counts = new int[26];
        int[] windowCounts = new int[26];

        for (int i = 0; i < n1; i++) {
            s1Counts[s1.charAt(i) - 'a']++;
            windowCounts[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Counts, windowCounts)) {
            return true;
        }

        for (int right = n1; right < n2; right++) {
            char rightChar = s2.charAt(right);
            windowCounts[rightChar - 'a']++;

            int leftIndex = right - n1;
            char leftChar = s2.charAt(leftIndex);
            windowCounts[leftChar - 'a']--;

            if (Arrays.equals(s1Counts, windowCounts)) {
                return true;
            }
        }

        return false;
    }
}
