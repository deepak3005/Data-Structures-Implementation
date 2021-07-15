// Check if a given number is prime or not

import java.util.*;

class CheckPrimeNumber
{
	public static boolean CheckPrimeOrNot(int n)
	{
		int m = (int) Math.sqrt(n);
		
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		if(CheckPrimeOrNot(n))
		{
			System.out.println("\nIt is a prime number.");
		}
		else
		{
			System.out.println("\nIt is NOT a prime number.");
		}
	}
}
