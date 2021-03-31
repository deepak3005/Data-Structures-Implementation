import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DFS_Traversal_Undirected_Graph
{
	int V;
	int E;
	LinkedList<Integer>[] adj;
	
	public DFS_Traversal_Undirected_Graph(int nodes)
	{
		V = nodes;
		E = 0;
		adj = new LinkedList[nodes];
		for(int v=0; v<V;v++)
		{
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v)
	{
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public void dfs(int s)
	{
		boolean[] visited = new boolean[V];
		
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		
		while(!stack.isEmpty())
		{
			int u = stack.pop();
			
			if(!visited[u])
			{
				visited[u] = true;
				System.out.print(u+"    ");
				
				for(int v : adj[u])
				{
					if(!visited[v])
					{
						stack.push(v);
					}
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		DFS_Traversal_Undirected_Graph m = new DFS_Traversal_Undirected_Graph(5);
		m.addEdge(0, 1);
		m.addEdge(1, 2);
		m.addEdge(2, 3);
		m.addEdge(3, 0);
		m.addEdge(2, 4);
		m.dfs(0);
	}
}
