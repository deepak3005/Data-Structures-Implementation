import java.util.Scanner;

public class InsertInMaxHeap
{
	private int[] heap;
	private int n; // Store size of max heap
	
	public InsertInMaxHeap(int capacity)
	{
		heap = new int[capacity+1]; // index 0 is kept empty
		n=0;
	}
	
	public boolean isEmpty()
	{
		return n==0;
	}
	
	public int size()
	{
		return n;
	}
	
	public void insert(int x)
	{
		if(n==heap.length-1)
		{
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}
	
	private void resize(int capacity) 
	{	
		int[] newArray = new int[capacity];
		for(int i=0;i<heap.length;i++)
		{
			newArray[i] = heap[i];
		}
		heap = newArray;
	}

	public void swim(int k)
	{
		while(k>1 && heap[k/2]<heap[k])
		{
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k=k/2; // because we need to continue shifting up till new value inserted is at correct position
		}
	}
	
	public void printMaxHeap()
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(heap[i]+"	");
		}
	}
	
	public static void main(String args[])
	{
		InsertInMaxHeap m = new InsertInMaxHeap(3);
		Scanner sc = new Scanner(System.in);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		m.insert(4);
		m.insert(5);
		m.insert(2);
		m.insert(6);
		m.insert(1);
		m.insert(3);
		m.printMaxHeap();
	}
}
