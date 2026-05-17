class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;

        boolean[] visited = new boolean[n];
        return dfs(arr, visited, start);
    }

    static boolean dfs(int[] arr, boolean[] visited, int start) {
        int n = arr.length;
        if (start < 0 || start >= n) {
            return false;
        }

        if (arr[start] == 0) {
            return true;
        }

        if (visited[start]) {
            return false;
        }


        visited[start] = true;
        int forward = start + arr[start];
        int backward = start - arr[start];

        return dfs(arr, visited, forward) || dfs(arr, visited, backward);
    }

}
