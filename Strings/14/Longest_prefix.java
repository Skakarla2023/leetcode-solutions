package com.skakarla.problems;

public class Longest_Common_prefix {

	public static void main(String[] args) {

		String[] str={"flower","fauna","fault"};
		Longest_Common_prefix obj=new Longest_Common_prefix();
		System.out.println(obj.lcp(str));
				
	}

	private static String lcp(String[] str) 
	{
		String prefix=str[0];
		for(int i=1;i<str.length;i++)
		{
			while(!str[i].startsWith(prefix))
			{
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;

		
		
	}

}
