package com.skakarla.problems;

public class Valid_Palindrome {

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";

        System.out.println("\"" + input1 + "\" is palindrome? " + isPalindrome(input1));
        System.out.println("\"" + input2 + "\" is palindrome? " + isPalindrome(input2));
    }

    public static boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        int i = 0;
        int j = a.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(a.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(a.charAt(j))) {
                j--;
            }

            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
