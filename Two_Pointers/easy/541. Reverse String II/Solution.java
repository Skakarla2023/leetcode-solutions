class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        
        char[] str = s.toCharArray();

    
        for (int i = 0; i < n; i += 2 * k) {
            reverse(str, i, Math.min(i + k - 1, n - 1));
        }

        return new String(str);
    }

    void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }

    }

}
