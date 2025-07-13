package com.skakarla.problems;

public class Reverse_Integer {

    public static void main(String[] args) {
        int input = 1534236469; // You can change this value to test
        int result = reverse(input);
        System.out.println("Reversed Integer: " + result);
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int a = x % 10;

            // Check for positive overflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && a > 7)) {
                return 0;
            }

            // Check for negative overflow
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && a < -8)) {
                return 0;
            }

            rev = rev * 10 + a;
            x = x / 10;
        }

        return rev;
    }
}
