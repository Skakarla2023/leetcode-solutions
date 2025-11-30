package leetcode_programs_updated;

public class SubarraySumEqualsK {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		
		int k = 6;
		System.out.println(subarray(nums,k));
	}

	private static int subarray(int[] nums, int k) {
		int n=nums.length;
		int count=0;
		for(int st=0;st<n;st++) {
			int sum=0;
			for(int end=st;end<n;end++) {
				sum+=nums[end];
				if(sum==k) {
					count++;
				}
			}
		}
		

		return count;
	}
}
