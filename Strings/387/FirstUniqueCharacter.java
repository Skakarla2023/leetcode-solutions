package leetcode_programs_updated;

import java.util.*;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		
		System.out.println(fucos(str));
	}

	private static int fucos(String str) {
		int[] freq = new int[26];
		
		for(char c:str.toCharArray()) {
			freq[c-'a']++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(freq[str.charAt(i)-'a']==1) {
				return i;
			}
		}
		
		return -1;
	}

}
