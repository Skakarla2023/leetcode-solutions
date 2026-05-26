import java.util.*;
import java.lang.*;

class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> upper = new HashSet<>();
        HashSet<Character> lower = new HashSet<>();
        int n = word.length();
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper.add(word.charAt(i));
            } else {
                lower.add(word.charAt(i));
            }
        }

        int count = 0;

        for (char c : lower) {
            if (upper.contains(Character.toUpperCase(c))) {
                count++;
            }
        }

        return count;
    }
}
