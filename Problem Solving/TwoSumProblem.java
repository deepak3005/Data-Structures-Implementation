//Two Sum Problem -> Given an array of integers nums and an integer target , return indices of the two numbers such that they add up to target .

import java.util.*;

class TwoSumProblem
{
	public static void FindPairs(int[]x, int y)
	{
		int i,j;
		for(i=0;i<x.length;i++)
		{
			for(j=i;j<x.length;j++)
			{
				if(x[i]+x[j]==y)
				{
					System.out.print("The pair of numbers that sum up to "+y+" are at the indices "+i+" and "+j+" in the given array.\n");
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Two Sum Problem :\n");
		System.out.print("Enter size of array : ");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.print("Enter numbers : ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Enter target : ");
		int b = s.nextInt();
		FindPairs(a,b);
	}
}
