// Program to print all substrings of a given string
// Also, if length of given string is "n", then total number of substrings are = (n*(n+1))/2

import java.util.*;

class SubStrings
{
	public static void printSubStrings(String[] str)
	{
		String ss = null;
		for(int i=0;i<str.length;i++)
		{
			ss = str[i];
			System.out.print("\n"+ss);
			for(int j=i+1;j<str.length;j++)
			{
				ss = ss + str[j];
				System.out.print("\n"+ss);
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		String s = sc.nextLine();
		
		String[] strArray = s.split(" ");
		
		System.out.print("\nSubstrings are : \n");
		printSubStrings(strArray);
	}
}
