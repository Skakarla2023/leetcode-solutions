class Solution {
    public boolean isNStraightHand(int[] hand, int g) {
        int n = hand.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int k : map.keySet()) {
            int v = map.get(k);
            if (v > 0) {
                for (int i = k; i < k + g; i++) {
                    if (!map.containsKey(i)) {
                        return false;
                    }
                    if (map.get(i) < v) {
                        return false;
                    }
                    map.put(i, map.get(i) - v);
                }
            }
        }

        return true;
    }
}
