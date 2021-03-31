import java.util.Scanner;

public class BinarySearch
{
	public void StartBinarySearch(int[] b,int capacity,int key)
	{
		int low = 0;
		int high = capacity-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(b[mid]==key)
			{
				System.out.print("Item found at index : "+mid);
				return;
			}
			if(key<b[mid])
			{
				high = mid-1;
			}
			if(key>b[mid])
			{
				low = mid+1;
			}
		}
		System.out.print("Item NOT found !");
	}
	
	public static void main(String args[])
	{
		BinarySearch m = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		System.out.print("Enter values in sorted order : ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter value of item to find : ");
		int value = sc.nextInt();
		m.StartBinarySearch(a,n,value);
	}
}
