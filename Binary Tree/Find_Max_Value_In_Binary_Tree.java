public class Find_Max_Value_In_Binary_Tree
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
	
	public int maxValue(TreeNode root)
	{
		if(root == null)
		{
			return Integer.MIN_VALUE;
		}
		
		int result = root.data;
		int left = maxValue(root.left);
		int right = maxValue(root.right);
		
		if(left>result)
		{
			result = left;
		}
		if(right>result)
		{
			result = right;
		}
		
		return result;
	}
	
	public static void main(String args[])
	{
		Find_Max_Value_In_Binary_Tree m = new Find_Max_Value_In_Binary_Tree();
		m.CreateBinaryTree();
		System.out.println("Max value in binary tree = "+m.maxValue(m.root));
	}
}
