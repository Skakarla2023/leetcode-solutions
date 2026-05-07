class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int start = 0; start < n; start++) {
            boolean[] visited = new boolean[n];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.offer(start);

            int maxValue = nums[start];

            while (!q.isEmpty()) {
                int i = q.poll();

                maxValue = Math.max(maxValue, nums[i]);

                for (int j = 0; j < n; j++) {
                    if (visited[j]) {
                        continue;
                    }

                    boolean canJump = false;

                    if (j > i && nums[i] > nums[j]) {
                        canJump = true;
                    }

                    if (j < i && nums[i] < nums[j]) {
                        canJump = true;
                    }

                    if (canJump) {
                        visited[j] = true;
                        q.offer(j);
                    }
                }
            }
            ans[start] = maxValue;
        }
        return ans;
    }
}
