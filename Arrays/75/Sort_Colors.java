package leetcode_programs_updated;

import java.util.*;

public class SortColors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] colors = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			colors[i] = sc.nextInt();
		}
		
		sortcolors(colors,n);
	}

	private static void sortcolors(int[] colors,int n) {
		 int mid=0,low=0,high=n-1;
		 
		 while(mid <= high) {
			 if(colors[mid]==0) {
				 int temp = colors[low];
				 colors[low] = colors[mid];
				 colors[mid]=temp;
				 low++;
				 mid++;
			 }
			 else if(colors[mid]==2) {
				 int temp = colors[high];
				 colors[high]=colors[mid];
				 colors[mid]=temp;
				 high--;
			 }
			 else {
				 mid++;
			 }
		 }
		 System.out.println(Arrays.toString(colors));
		 
	}
}

