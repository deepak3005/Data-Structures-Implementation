import java.util.*;

class Stack
{
	int top;
	int x;
	static final int max=1000;
	int a[] = new int[max];
	
	Stack()
	{
		top = -1;
	}
	
	boolean isEmpty()
	{
		if(top<0)
			return true;
		else
			return false;
	}
	
	boolean push(int value)
	{
		
		if(top>=max-1)
		{
			System.out.println("Stack overflowed!");
			return false;
		}
		else
		{
			a[++top] = value;
			return true;
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflowed!");
			return 0;
		}
		else
		{
			return a[top--];
		}
	}
	
	void viewStack()
	{
		System.out.println("\n");
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println("\n");
	}
	
	void peek()     // peek returns element at top
	{
		System.out.println("Item at top = "+a[top]);
	}
	
	void findItem(int value)
	{
		int pos=top;
		for(int i=pos;i>=0;i--)
		{
			if(a[i]==value)
			{
				int x = i+1;
				System.out.println("Position of item from bottom of stack is : "+x+"\n");
			}
		}
	}
}

public class Main 
{
	public static void main(String[] args)
	{
		Stack stacy = new Stack();
		Scanner s = new Scanner(System.in);
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("1. Push Item");
			System.out.println("2. Pop Item");
			System.out.println("3. View Stack");
			System.out.println("4. Find Item at Top");
			System.out.println("5. Search any Item");
			System.out.println("6. EXIT");
			System.out.println("Enter your choice : ");
			
			int choice = s.nextInt();
			int value;
			switch(choice)
			{
				case 1:
					System.out.println("Enter value of item : ");
					value = s.nextInt();
					stacy.push(value);
					break;
					
				case 2:
					stacy.pop();
					break;
				
				case 3:
					stacy.viewStack();
					break;
				
				case 4:
					stacy.peek();
					break;
				
				case 5:
					System.out.println("Enter value of item :");
					value = s.nextInt();
					stacy.findItem(value);
					break;
				
				case 6:
					flag=false;
					break;
				
				default:System.out.println("Invalid choice");
			}
		}
	}
}
