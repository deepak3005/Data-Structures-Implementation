import java.util.Scanner;

public class SelectionSort
{
	public void StartSelectionSorting(int[] b, int x)
	{
		for(int i=0;i<x-1;i++)
		{
			int min = i;
			for(int j=i+1; j<x;j++)
			{
				if(b[j]<b[min])
				{
					min = j;
				}
			}
			int temp = b[min];
			b[min] = b[i];
			b[i] = temp;
		}
		
		System.out.print("\nYour sorted array : ");
		for(int k=0;k<x;k++)
		{
			System.out.print(b[k]+"    ");
		}
	}
	
	public static void main(String args[])
	{
		SelectionSort m = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		System.out.print("\nEnter values : ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		m.StartSelectionSorting(a,n);
	}
}
