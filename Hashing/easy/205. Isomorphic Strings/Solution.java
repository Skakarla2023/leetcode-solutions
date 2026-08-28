class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> StoT = new HashMap<>();
        HashMap<Character, Character> TtoS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (StoT.containsKey(a)) {
                if (StoT.get(a) != b) {
                    return false;
                }
            }

            if (TtoS.containsKey(b)) {
                if (TtoS.get(b) != a) {
                    return false;
                }
            }

            StoT.put(a, b);
            TtoS.put(b, a);
        }

        return true;
    }
}
