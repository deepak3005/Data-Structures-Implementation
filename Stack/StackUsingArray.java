// Implementing stack using array ...

import java.util.*;

class Stack
{
	int top;
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
		if(top>=(max-1))
		{
			System.out.println("Stack overflowed !");
			return false;
		}
		else
		{
			a[top+1] = value;
			top = top+1;
			return true;
		}
	}
	
	boolean pop()
	{
		if(top<0)
		{
			System.out.println("The stack is empty !");
			return false;
		}
		else
		{
			top = top-1;
			return true;
		}
	}
	
	public void viewStack()
	{
		if(top<0)
		{
			System.out.println("The stack is empty !");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(a[i]);
			}
		}
	}
	
	public void peek()     // gives item at top of stack
	{
		if(top<0)
		{
			System.out.println("The stack is empty !");
		}
		else
		{
			System.out.println("Item at the top of your stack is = "+a[top]);
		}
	}
	
	public void searchItem(int value)
	{
		if(top<0)
		{
			System.out.println("The stack is empty !");
		}
		else
		{
			int position = 0;
			for(int i=0;i<=top;i++)
			{
				if(a[i]==value)
				{
					position = i+1;
					break;
				}
			}
			System.out.println("The item with value "+value+" is at position "+position+" from the bottom of the stack.");
		}
	}
}

class StackUsingArray
{
	public static void main(String args[])
	{
		Stack stacy = new Stack();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag)
		{
			System.out.println("\n1. Push Item");
			System.out.println("2. Pop Item");
			System.out.println("3. View Stack");
			System.out.println("4. Find item at top");
			System.out.println("5. Search item");
			System.out.println("6. EXIT\n");
			System.out.print("Enter a choice : ");
			int choice = sc.nextInt();
			int value;
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter value : ");
				value = sc.nextInt();
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
				System.out.println("Enter value : ");
				value = sc.nextInt();
				stacy.searchItem(value);
				break;
			case 6:
				flag = false;
				break;
			default: System.out.println("Invalid choice !");
			}
			
		}
	}
}
