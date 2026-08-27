class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> PtoS = new HashMap<>();
        HashMap<String, Character> StoP = new HashMap<>();

        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            char a = pattern.charAt(i);
            String b = arr[i];

            if (PtoS.containsKey(a)) {
                if (!PtoS.get(a).equals(b)) {
                    return false;
                }
            }

            if (StoP.containsKey(b)) {
                if (StoP.get(b) != a) {
                    return false;
                }
            }

            PtoS.put(a, b);
            StoP.put(b, a);
        }

        return true;

    }
}
