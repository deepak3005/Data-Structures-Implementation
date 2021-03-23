public class Recursive_PostOrder_Traversal_Binary_Tree
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
	
	public static void main(String args[])
	{
		Recursive_PostOrder_Traversal_Binary_Tree m = new Recursive_PostOrder_Traversal_Binary_Tree();
		System.out.println("PostOrder Traversal of Binary Tree :\n");
		m.CreateBinaryTree();
		m.PostOrder(m.root);
	}
}
