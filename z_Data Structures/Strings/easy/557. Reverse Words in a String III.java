class Solution {
    public String reverseWords(String s) {
        // the following command creates an array of strings, by splitting the given the string based on space
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = new StringBuilder(strs[i]).reverse().toString();
        }

        // the following command joins all the elements in strs and places a " " between each word.
        return String.join(" ", strs);
    }
}
