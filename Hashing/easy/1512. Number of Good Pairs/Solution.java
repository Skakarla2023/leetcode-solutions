class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int count = 0;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int v = entry.getValue();

            count += (v*(v-1))/2;
        }

        return count;
    }
}
