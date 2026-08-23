class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int n = prefix.length();

        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                n--;
                prefix = prefix.substring(0, n);
            }
            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }
}
