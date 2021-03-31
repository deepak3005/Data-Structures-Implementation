import java.util.Scanner;

public class AdjacencyMatrix_Representation_Of_UndirectedGraph
{
	int V;
	int E;
	int[][] adjMatrix;
	
	public AdjacencyMatrix_Representation_Of_UndirectedGraph(int nodes)
	{
		V = nodes;
		E = 0;
		adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v)
	{
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1;
		E++;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, "+ E + " edges "+"\n");
		for(int v=0;v<V;v++)
		{
			sb.append(v + ": ");
			for(int w:adjMatrix[v])
			{
				sb.append(w+"  ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		AdjacencyMatrix_Representation_Of_UndirectedGraph m = new AdjacencyMatrix_Representation_Of_UndirectedGraph(4);
		m.addEdge(0, 1);
		m.addEdge(1, 2);
		m.addEdge(2, 3);
		m.addEdge(3, 0);
		System.out.println(m);
	}
}
