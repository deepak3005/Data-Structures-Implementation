// Implementing stack using Linked List ...

import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node()
	{
		data = 0;
		next = null;
	}
	
	Node(int d, Node n)
	{
		data = d;
		next = n;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public void setNext(Node n)
	{
		next = n;
	}
	
	public int getData()
	{
		return data;
	}
	
	public Node getNext()
	{
		return next;
	}
}

class LinkedList
{
	private Node start, top;
	private int size;
	
	LinkedList()
	{
		size = 0;
		start = null;
		top = start;
	}
	
	boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	
	boolean push(int value)
	{
		Node newNodeAdded = new Node();
		newNodeAdded.setData(value);
		newNodeAdded.setNext(top);
		top = newNodeAdded;
		start = newNodeAdded;
		size++;
		return true;
	}
	
	boolean pop()
	{
		if(top==null)
		{
			System.out.println("The stack is empty !");
			return false;
		}
		else
		{
			top = top.getNext();
			start = start.getNext();
			size--;
			return true;
		}
	}
	
	public void viewStack()
	{
		if(top==null)
		{
			System.out.println("The stack is empty !");
		}
		else
		{
			Node t;
			if(isEmpty())
			{
				System.out.println("List is empty.");
			}
			else
			{
				t = top;
				for(int i=1;i<=size;i++)
				{
					System.out.println("  "+t.getData());
					t = t.getNext();
				}
			}
		}
	}
	
	public void peek()     // gives item at top of stack
	{
		if(isEmpty())
		{
			System.out.println("List is empty.");
		}
		else
		{
			System.out.println("Value at the top of stack is = "+top.getData());
		}
	}
	
	public void searchItem(int value)
	{
		if(isEmpty())
		{
			System.out.println("List is empty.");
		}
		else
		{
			Node t=top;
			int position = 1;
			for(int i=1;i<=size;i++)
			{
				if(t.getData()==value)
				{
					System.out.println("Item with value "+value+" found at position "+position+" from the top of the stack.");
					break;
				}
				else
				{
					t=t.getNext();
					position++;
				}
			}
		}
	}
}

class StackUsingLinkedList
{
	public static void main(String args[])
	{
		LinkedList LL = new LinkedList();
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
				LL.push(value);
				break;
			case 2:
				LL.pop();
				break;
			case 3:
				LL.viewStack();
				break;
			case 4:
				LL.peek();
				break;
			case 5:
				System.out.println("Enter value : ");
				value = sc.nextInt();
				LL.searchItem(value);
				break;
			case 6:
				flag = false;
				break;
			default: System.out.println("Invalid choice !");
			}
			
		}
	}
}
