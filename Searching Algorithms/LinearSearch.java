import java.util.Scanner;

public class LinearSearch
{
	public void StartLinearSearch(int[] b,int capacity,int key)
	{
		for(int i=0;i<capacity;i++)
		{
			if(key==b[i])
			{
				System.out.print("Item found at index : "+i);
				return;
			}
		}
		System.out.print("Item NOT found !");
	}
	
	public static void main(String args[])
	{
		LinearSearch m = new LinearSearch();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		System.out.print("Enter values : ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter value of item to find : ");
		int value = sc.nextInt();
		m.StartLinearSearch(a,n,value);
	}
}
