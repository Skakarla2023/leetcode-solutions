import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited =  new boolean[rooms.size()];

        q.offer(0);
        visited[0] = true;

        while(!q.isEmpty()) {
            int curr = q.poll();
            for(int i:rooms.get(curr)) {
                if(!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }

        for(int i=0;i<rooms.size();i++){
            if(visited[i]==false) {
                return false;
            }
        }

        return true;
    }
}
