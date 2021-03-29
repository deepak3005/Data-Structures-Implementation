// Row and Column wise sorted matrix is one in which all the elements in a row or in a column are sorted in ascending order.

import java.util.Scanner;

public class Search_Key_In_RowColumnWise_Sorted_Matrix
{
	public static void Search(int b[][], int x, int value)
	{
		int i=0;
		int j=x-1;
		while(i<x&&j>=0)
			{
				if(b[i][j]==value)
				{
					System.out.print("Item found at index ("+i+","+j+")");
					System.out.print("\n");
					return;
				}
				if(b[i][j]>value)
				{
					j--;
				}
				else
				{
					i++;
				}
			}
		System.out.print("Item not found !");
		System.out.print("\n");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("<- Row and Column wise sorted matrix is one in which all the elements in a row or in a column are sorted in ascending order ->");
		System.out.print("\n");
		System.out.print("Enter the no. of rows and columns you want for your nXn row and column wise sorted matrix : ");
		int n = sc.nextInt();
		System.out.print("\n");
		System.out.println("Enter "+n*n+" elements your "+n+"X"+n+" row and column wise sorted matrix : ");
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("\n");
		System.out.println("Your matrix : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"	");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("Value of item you want to search in the matrix : ");
		int key = sc.nextInt();
		System.out.print("\n");
		Search(a,n,key);
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("");
			System.out.println("1. Find another item");
			System.out.println("2. EXIT");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			System.out.print("\n");
			switch(choice)
			{
				case 1:
					System.out.print("Value of item you want to search in the matrix : ");
					key = sc.nextInt();
					System.out.print("\n");
					Search(a,n,key);
					break;
				case 2:
					flag=false;
					break;
				default:System.out.println("Invalid choice");
			}
		}
	}
}
