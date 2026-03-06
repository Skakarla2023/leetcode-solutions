import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] i : prerequisites) {
            int prereq = i[1];
            int course = i[0];

            adjList.get(prereq).add(course);
            indegree[course]++;
        }

        int[] topSort = new int[numCourses];
        //List<Integer> topSort = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        int ind = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            topSort[ind++] = curr;
            //topSort.add(curr);

            for (int i : adjList.get(curr)) {
                indegree[i]--;

                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }

        if (ind == numCourses) {
            return topSort;
        }
        return new int[0];
    }
}
