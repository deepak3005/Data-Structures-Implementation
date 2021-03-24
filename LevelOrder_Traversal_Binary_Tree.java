// Queue data structure is used

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_Traversal_Binary_Tree
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
	
	public void CreateBinaryTree()
	{
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
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
		LevelOrder_Traversal_Binary_Tree m = new LevelOrder_Traversal_Binary_Tree();
		System.out.println("LevelOrder Traversal of Binary Tree :\n");
		m.CreateBinaryTree();
		m.LevelOrder();
	}
}
