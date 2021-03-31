import java.util.Scanner;

public class BubbleSort
{
	public void StartBubbleSorting(int[] b, int x)
	{
		for(int k=0;k<x;k++)
		{
			for(int i=0;i<x-1;i++)
			{
				if(b[i]>b[i+1])
				{
					int temp;
					temp = b[i];
					b[i] = b[i+1];
					b[i+1] = temp;
				}
			}
		}
		
		System.out.print("\nYour sorted array : ");
		for(int j=0;j<x;j++)
		{
			System.out.print(b[j]+"    ");
		}
	}
	
	public static void main(String args[])
	{
		BubbleSort m = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		System.out.print("\nEnter values : ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		m.StartBubbleSorting(a,n);
	}
}
