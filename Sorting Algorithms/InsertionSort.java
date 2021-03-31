import java.util.Scanner;

public class InsertionSort
{
	public void StartInsertionSorting(int[] b, int x)
	{
		for(int i=1;i<x;i++)
		{
			int temp = b[i];
			int j = i-1;
			while(j>=0&&b[j]>temp)
			{
				b[j+1]=b[j];
				j=j-1;
			}
			b[j+1]=temp;
		}
		
		System.out.print("\nYour sorted array : ");
		for(int j=0;j<x;j++)
		{
			System.out.print(b[j]+"    ");
		}
	}
	
	public static void main(String args[])
	{
		InsertionSort m = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		System.out.print("\nEnter values : ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		m.StartInsertionSorting(a,n);
	}
}
