// Implementing Queue using Linked List ...

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
	private Node front, rear;
	private int size;
	
	LinkedList()
	{
		size = 0;
		front = null;
		rear = null;
	}
	
	boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
	}
	
	boolean enqueue(int value)
	{
		Node newNodeAdded = new Node();
		newNodeAdded.setData(value);
		if(isEmpty())
		{
			front = newNodeAdded;
		}
		else
		{
			rear.setNext(newNodeAdded);
		}
		rear = newNodeAdded;
		size++;
		return true;
	}
	
	boolean dequeue()
	{
		if(front==null)
		{
			System.out.println("The queue is empty !");
			return false;
		}
		else
		{
			front = front.getNext();
			size--;
			return true;
		}
	}
	
	public void viewQueue()
	{
		if(front==null)
		{
			System.out.println("The queue is empty !");
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
				t = front;
				for(int i=1;i<=size;i++)
				{
					System.out.println("  "+t.getData());
					t = t.getNext();
				}
			}
		}
	}
}

class QueueUsingLinkedList
{
	public static void main(String args[])
	{
		LinkedList LL = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag)
		{
			System.out.println("\n1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. View Queue");
			System.out.println("4. EXIT\n");
			System.out.print("Enter a choice : ");
			int choice = sc.nextInt();
			int value;
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter value : ");
				value = sc.nextInt();
				LL.enqueue(value);
				break;
			case 2:
				LL.dequeue();
				break;
			case 3:
				LL.viewQueue();
				break;
			case 4:
				flag = false;
				break;
			default: System.out.println("Invalid choice !");
			}
			
		}
	}
}
