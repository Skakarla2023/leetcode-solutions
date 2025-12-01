package leetcode_programs_updated;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		System.out.println(reverse(s));
	}

	private static char[] reverse(char[] s) {
		int i=0;
		int j=s.length-1;
		while(i<j) {
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		return s;
	}

}

