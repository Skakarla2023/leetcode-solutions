


import java.util.*;
import java.lang.*;

class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> upper = new HashMap<>();
        HashMap<Character, Integer> lower = new HashMap<>();
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper.putIfAbsent(ch,i);
            } else {
                lower.put(ch,i);
            }
        }

        int count = 0;

        for (char c : lower.keySet()) {
            char upperchar = Character.toUpperCase(c);
            if (upper.containsKey(upperchar) && upper.get(upperchar) > lower.get(c)) {
                count++;
            }
        }

        return count;
    }
}
