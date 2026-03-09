import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] right = new int[n];
        int[] left = new int[n];
        int max_area = 0;

        Stack<Integer> s1 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (s1.size() > 0 && heights[s1.peek()] >= heights[i]) {
                s1.pop();
            }
            right[i] = s1.isEmpty() ? n : s1.peek();
            s1.push(i);
        }
        s1.clear();

        for (int i = 0; i < n; i++) {
            while (s1.size() > 0 && heights[s1.peek()] >= heights[i]) {
                s1.pop();
            }
            left[i] = s1.isEmpty() ? -1 : s1.peek();
            s1.push(i);
        }

        s1.clear();

        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = right[i] - left[i] - 1;
            int currArea = height * width;

            max_area = Math.max(currArea, max_area);
        }

        return max_area;
    }
}

