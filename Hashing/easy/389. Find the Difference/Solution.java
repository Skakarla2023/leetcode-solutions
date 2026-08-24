class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : t.toCharArray()) {
            // if (!map.containsKey(ch)) {
            //     return ch;
            // }

            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

        }

        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return ch;
            }

            else if (map2.get(ch) > map.get(ch)) {
                return ch;
            }

        }

        return '0';
    }
}
