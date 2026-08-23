class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;

        if (s.length() == 0 || s.length() == 1) {
            return s;
        }

        char[] str = s.toCharArray();

        while (left <= right) {

            while (left < right && !isVowel(str[left])) {
                left++;
            }

            while (left < right && !isVowel(str[right])) {
                right--;
            }

            if (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            } else {
                break;
            }
        }

        return new String(str);
    }

    boolean isVowel(char ch) {
        //char ch = cha.toLowerCase();
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
