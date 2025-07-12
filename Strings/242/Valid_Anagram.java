
package com.skakarla.problems;

import java.util.Arrays;

public class Valid_Anagram 
{
	public static void main(String[] args) 
	{
		String str1="anagram";
		String str2="nagaram";
		
		char[] char1=str1.toCharArray();
		Arrays.sort(char1);
		String sortedstr1=new String(char1);
		
		char[] char2=str2.toCharArray();
		Arrays.sort(char2);
		String sortedstr2=new String(char2);
		
		if(sortedstr1.equals(sortedstr2))
		{
			System.out.println("Valid Anagram");
		}
		else
		{
			System.out.println("Not a valid anagram");
		}
		
	}

}

