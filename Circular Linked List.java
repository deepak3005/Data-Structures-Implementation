import java.util.*;

class Node
{
	private int data;
	private Node next;
	
	public Node()
	{
		data = 0;
		next = null;
	}
	
	public Node(int d, Node n)
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
		return (data);
	}
	
	public Node getNext()
	{
		return (next);
	}
}

class CircularLinkedList
{
	private int size;
	private Node last;
	
	public CircularLinkedList()
	{
		size = 0;
		last = null;
	}
	
	public boolean isEmpty()
	{
		if(last==null)
			return (true);
		else
			return (false);
	}
	
	public int getListSize()
	{
		return (size);
	}
	
	public void insertAtFirst(int value)
	{
		Node newNodeAdded = new Node();
		if(last==null)
		{
			last = newNodeAdded;
			newNodeAdded.setData(value);
			newNodeAdded.setNext(newNodeAdded);
		}
		else
		{
			Node t = last;
			newNodeAdded.setData(value);
			newNodeAdded.setNext(t.getNext());
			last.setNext(newNodeAdded);
		}
		size++;
	}
	
	public void insertAtLast(int value)
	{
		Node t = last;
		Node newNodeAdded = new Node();
		newNodeAdded.setData(value);
		newNodeAdded.setNext(t.getNext());
		t.setNext(newNodeAdded);
		last = newNodeAdded;
		size++;
	}
	
	public void insertAtPos(int value, int pos)
	{
		if(pos==1)
		{
			insertAtFirst(value);
		}
		else if(pos==size+1)
		{
			insertAtLast(value);
		}
		else if(pos>1&&pos<=size)
		{
			Node t = last;
			Node newNodeAdded = new Node();
			newNodeAdded.setData(value);
			for(int i=1;i<pos;i++)
			{
				t=t.getNext();
			}
			newNodeAdded.setNext(t.getNext());
			t.setNext(newNodeAdded);
			size++;
		}
		else
			System.out.println("Insertion not possible at position : "+pos);
	}
	
	public void deleteFirst()
	{
		Node t = last;
		t.setNext((t.getNext()).getNext());
		size--;
	}
	
	public void deleteLast()
	{
		Node t = last;
		for(int i=1;i<size;i++)
		{
			t=t.getNext();
		}
		t.setNext(last.getNext());
		last=t;
		size--;
	}
	
	public void deleteAtPos(int pos)
	{
		if(last==null)
			System.out.println("List is empty.");
		else if(pos>size||pos<1)
			System.out.println("Invalid position.");
		else if(pos==1)
			deleteFirst();
		else if(pos==size)
			deleteLast();
		else
		{
			Node t =last;
			for(int i=1;i<pos;i++)
			{
				t=t.getNext();
			}
			t.setNext((t.getNext()).getNext());
			size--;
		}
	}
	
	public void viewList()
	{
		Node t;
		if(isEmpty())
		{
			System.out.println("List is empty.");
		}
		else
		{
			t = last;
			for(int i=1;i<=size;i++)
			{
				t = t.getNext();
				System.out.println("  "+t.getData());	
			}
		}
	}
}

public class Main3
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		CircularLinkedList list = new CircularLinkedList();
		boolean flag=true;
		while(flag)
		{
			System.out.println("");
			System.out.println("1. Add item to the list at first");
			System.out.println("2. Add item to the list at last");
			System.out.println("3. Add item to the list at position");
			System.out.println("4. Delete item from the list at first");
			System.out.println("5. Delete item from the list at last");
			System.out.println("6. Delete item from the list at position");
			System.out.println("7. View List");
			System.out.println("8. EXIT");
			System.out.println("Enter your choice : ");
			int choice = s.nextInt();
			int position,value;
			switch(choice)
			{
				case 1:
					System.out.println("Enter value of item : ");
					value = s.nextInt();
					list.insertAtFirst(value);
					break;
				case 2:
					System.out.println("Enter value of item : ");
					value = s.nextInt();
					list.insertAtLast(value);
					break;
				case 3:
					System.out.println("Enter position of item : ");
					position = s.nextInt();
					System.out.println("Enter value of item : ");
					value = s.nextInt();
					list.insertAtPos(value, position);
					break;
				case 4:
					list.deleteFirst();
					break;
				case 5:
					list.deleteLast();
					break;
				case 6:
					System.out.println("Enter position : ");
					position = s.nextInt();
					list.deleteAtPos(position);
					break;
				case 7:
					list.viewList();
					break;
				case 8:
					flag=false;
					break;
				default:System.out.println("Invalid choice");
			}
		}
	}
}
