class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n = nums.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {

            if (map.get(i) == 0) {
                continue;
            }

            while (map.get(i) > 0) {
                for (int j = i; j < i + k; j++) {
                    if (!map.containsKey(j)) {
                        return false;
                    }

                    if (map.get(j) == 0) {
                        return false;
                    }
                    map.put(j, map.get(j) - 1);
                }
            }
        }

        return true;
    }
}
