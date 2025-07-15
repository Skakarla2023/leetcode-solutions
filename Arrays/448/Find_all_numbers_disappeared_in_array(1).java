import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        
        for(int num:nums){
            set.add(num);
        }

        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i)){
                res.add(i); 
            }
        }
        return res;
    }
}
