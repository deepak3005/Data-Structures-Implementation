/* 

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

Examples:  

Output screen :

Enter no of walls : 4

Enter height of walls : 4 2 3 4

Water Stored : 3 units

*/


import java.util.*;

class TrappingRainWater
{
	public static int VolumeOfWaterStored(int[] a)
	{
		int totalVolume = 0;
		int leftBoundary, rightBoundary, lower, waterVolume;
		
		for(int i=1;i<a.length-1;i++)
		{
			leftBoundary = a[i-1];
			rightBoundary = a[i+1];
			
			for(int j=i-1;j>=0;j--)
			{
				if(a[j]>leftBoundary)
				{
					leftBoundary = a[j];
				}
			}
			
			for(int k=i+1;k<a.length;k++)
			{
				if(a[k]>rightBoundary)
				{
					rightBoundary = a[k];
				}
			}
			
			lower = Math.min(leftBoundary, rightBoundary);
			
			waterVolume = lower-a[i];
			
			if(waterVolume>0)
			{
				totalVolume = totalVolume + waterVolume;
			}
		}
		
		return totalVolume;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of walls : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("\nEnter height of walls : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nWater Stored : "+VolumeOfWaterStored(arr)+" units");
	}
}
