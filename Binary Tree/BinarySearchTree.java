/*
    Binary Search Tree is a node-based binary tree data structure which has the following properties:

    -> The left subtree of a node contains only nodes with keys lesser than the node’s key.
    -> The right subtree of a node contains only nodes with keys greater than the node’s key.
    -> The left and right subtree each must also be a binary search tree.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree
{
	private TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data)
		{
			this.data = data;
		}
	}
	
	public void insert(int value)
	{
		root = insert(root,value);
	}
	
	public TreeNode insert(TreeNode root, int value)
	{
		if(root==null)
		{
			root = new TreeNode(value);
			return root;
		}
		if(value<root.data)
		{
			root.left = insert(root.left,value);
		}
		if(value>root.data)
		{
			root.right = insert(root.right,value);
		}
		return root;
	}
	
	public void preOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data + "    ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void preOrder()
	{
		preOrder(root);
	}
	
	public void inOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + "    ");
		inOrder(root.right);
	}
	
	public void inOrder()
	{
		inOrder(root);
	}
	
	public void PostOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data + "    ");
	}
	
	public void PostOrder()
	{
		PostOrder(root);
	}
	
	public void LevelOrder()
	{
		if(root == null)
		{
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList();
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			TreeNode temp = queue.poll();
			System.out.print(temp.data + "    ");
			
			if(temp.left!=null)
			{
				queue.offer(temp.left);
			}
			if(temp.right!=null)
			{
				queue.offer(temp.right);
			}
		}
	}
	
	public static void main(String args[])
	{
		BinarySearchTree m = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("1. Insert item");
			System.out.println("2. PreOrder Traversal");
			System.out.println("3. InOrder Traversal");
			System.out.println("4. PostOrder Traversal");
			System.out.println("5. LevelOrder Traversal");
			System.out.println("6. EXIT");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			int position,value;
			switch(choice)
			{
				case 1:
					System.out.println("Enter value to be inserted :");
					value = sc.nextInt();
					m.insert(value);
					System.out.println("\n");
					break;
				case 2:
					System.out.print("PreOrder Traversal : ");
					m.preOrder();
					System.out.println("\n");
					break;
				case 3:
					System.out.print("InOrder Traversal : ");
					m.inOrder();
					System.out.println("\n");
					break;
				case 4:
					System.out.print("PostOrder Traversal : ");
					m.PostOrder();
					System.out.println("\n");
					break;
				case 5:
					System.out.print("LevelOrder Traversal : ");
					m.LevelOrder();
					System.out.println("\n");
					break;
				case 6:
					flag=false;
					break;
				default:System.out.println("Invalid choice");
			}
		}
	}
}
