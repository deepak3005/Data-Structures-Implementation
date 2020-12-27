import java.util.*;
import java.lang.*;

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

class LinkedList
{
	private int size;
	private Node start;
	
	public LinkedList()
	{
		size = 0;
		start = null;
	}
	
	public boolean isEmpty()
	{
		if(start==null)
			return(true);
		else
			return(false);
	}
	
	public int getListSize()
	{
		return(size);
	}
	
	public void insertAtFirst(int value)
	{
		Node NewNodeAdded = new Node();
		NewNodeAdded.setData(value);
		NewNodeAdded.setNext(start);
		start = NewNodeAdded;
		size++;
	}
	
	public void insertAtLast(int value)
	{
		Node NewNodeAdded = new Node();
		NewNodeAdded.setData(value);
		NewNodeAdded.setNext(null);
		Node t = start;
		if(t==null)
			start = NewNodeAdded;
		else
		{
			while(t.getNext()!=null)
			{
				t = t.getNext();
			}
			t.setNext(NewNodeAdded);
		}
		size++;
	}
	
	public void insertAtPos(int value, int pos)
	{
		if(pos==1)
			insertAtFirst(value);
		if(pos==size+1)
			insertAtLast(value);
		if(pos>1&&pos<=size)
		{
			Node t=start;
			Node NewNodeAdded = new Node(value,null);
			for(int i=1;i<pos-1;i++)
			{
				t=t.getNext();
			}
			NewNodeAdded.setNext(t.getNext());
			t.setNext(NewNodeAdded);
			size++;
		}
		else
			System.out.println("Insertion not possible at position : "+pos);
	}
	
	public void deleteAtPos()
	{
		
	}
	
	public void deleteFirst()
	{
		
	}
	
	public void deleteLast()
	{
		
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
			t = start;
			for(int i=1;i<=size;i++)
			{
				System.out.println("  "+t.getData());
				t = t.getNext();
			}
		}
	}
}

public class Main
{
	public static void main(String args[])
	{
		
	}
}
