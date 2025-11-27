package leetcode_programs_updated;

import java.util.*;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(productofarray(nums)));

	}

	public static int[] productofarray(int[] nums) {
		int len = nums.length;
		int[] ans = new int[len];
		int product = 1;
		int zerocount = 0;

		for (int i : nums) {
			if (i == 0) {
				zerocount++;
			} else {
				product *= i;
			}
		}

		if (zerocount > 1) {
			return ans;
		}

		for (int i = 0; i < len; i++) {
			if (nums[i] == 0) {
				ans[i] = product;
			} else if (zerocount == 0) {
				ans[i] = product / nums[i];
			} else {
				ans[i] = 0;
			}
		}

		return ans;
	}

}
