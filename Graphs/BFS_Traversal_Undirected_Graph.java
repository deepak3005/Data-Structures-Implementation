import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal_Undirected_Graph
{
	int V;
	int E;
	LinkedList<Integer>[] adj;
	
	public BFS_Traversal_Undirected_Graph(int nodes)
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
	
	public void bfs(int s)
	{
		boolean[] visited = new boolean[V];
		
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);
		
		while(!q.isEmpty())
		{
			int u = q.poll();
			System.out.print(u+"    ");
			
			for(int v : adj[u])
			{
				if(!visited[v])
				{
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		BFS_Traversal_Undirected_Graph m = new BFS_Traversal_Undirected_Graph(5);
		m.addEdge(0, 1);
		m.addEdge(1, 2);
		m.addEdge(2, 3);
		m.addEdge(3, 0);
		m.addEdge(2, 4);
		m.bfs(0);
	}
}
