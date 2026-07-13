class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int area = 0;
        int maxArea = 0;

        // right[i] array stores the first smallest number to its right of i
        int[] right = new int[n];
        // left[] stores the first smallest number to its left
        int[] left = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = right[i] - left[i] - 1;

            area = height * width;
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
