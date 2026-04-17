import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[][] arr = new int[map.size()][2];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[index][0] = entry.getKey();
            arr[index][1] = entry.getValue();
            index++;
        }

        Arrays.sort(arr, (a, b) -> b[1] - a[1]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i][0];
        }

        return res;
    }
}
