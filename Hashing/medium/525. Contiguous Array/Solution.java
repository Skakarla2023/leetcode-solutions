class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int len = 0;
        int max_len = 0;

        int zc = 0, oc = 0;
        for (int i : nums) {
            if (i == 0) {
                zc++;
            } else {
                oc++;
            }
        }

        if (zc == oc) {
            return nums.length;
        }

        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                prefixSum++;
            } else {
                prefixSum--;
            }
            if (map.containsKey(prefixSum)) {
                len = i - map.get(prefixSum);
                max_len = Math.max(len, max_len);
            } else {
                map.put(prefixSum, i);
            }
        }

        return max_len;

    }
}
