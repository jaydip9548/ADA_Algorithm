import java.util.Arrays;
import java.util.Comparator;

public class Kruskal_Algo {

	public static void Kruskal(int graph[][],int V) {
	
		int E = V-1;
		
		int parent[] = new int[V];
		int rank[] = new int[V];
		
		for(int i=0; i<V;i++) { //Mark all the node as independant set
			parent[i] = -1;
			rank[i] = 0;
			}
		
	}
	
	public static void main(String[] args) {
	int V = 6;
		int graph[][] = {
				//{Source,dest,weight}
				{0,1,1},{1,3,1},{2,4,1},{0,2,2},{2,3,2},{3,4,2},{1,2,3},{1,4,3},{4,5,3},{3,5,4}
		};
		
		//Arrays.sort(graph, Comparator.comparingDouble(o -> o[2]));
		
		Kruskal(graph,V);
		
		
		 
//		for(int i=0; i<graph.length;i++) {
//			for(int j=0; j<graph[i].length;j++) {
//				System.out.print(" "+graph[i][j]);
//			}
//			System.out.println();
//		}

	}
}
