import java.util.Arrays;

public class Prims_Algo {

	public static void findMST(int graph[][],int V) {
		
	int parent[] = new int[V];
	int value[] = new int[V];
	boolean setMST[] = new boolean[V];

	
	Arrays.fill(value, Integer.MAX_VALUE);
	
	parent[0] = -1; //Start node has no parent
	value[0] = 0;
	
	//Form MST with (V-1) edges
	for(int i=0 ;i<V-1;i++) {
		 
		int min=Integer.MAX_VALUE;
		int index = 0;
		for(int j=0;j<V;j++) {
			if(value[j] < min && setMST[j]==false ) {
				min = value[j];
				index = j;
			}
		}
		
		setMST[index] = true;
		
		for(int j=0;j<V;j++) {
			
			//1.Edge is present from index to j.
			//2.Vertex j is not included in MST
			//3.Edges weight is similar than current edge weight
			
			if(graph[index][j] != 0 && setMST[j]==false && graph[index][j] < value[j]) {
				
				value[j] = graph[index][j];
				parent[j] = index;
			}
			}
			}

	System.out.println("The Graph with minimum weighted node  is ");
	for(int i=1;i<V;i++) {
		
		int p = parent[i];
		
		System.out.println("Node ("+p+") " +" to "+"Node ("+i+") "+"  "+graph[p][i]);
	}
	}
	
	public static void main(String[] args) {
		
		double start = System.currentTimeMillis();
		int V = 6;
		
		
//		int graph[][] = {
//		 i to j with w weight
//				{0,1,7},{0,2,8},{1,2,3},{1,3,6},{2,3,4},{2,4,3},{3,4,2},{3,5,5},{4,5,2}
//		};
		
		//Matrix Of Graph
		int matrix[][] = {
				{0,13,8,1,0,0},
				{13,0,15,0,0,0},
				{8,15,0,5,3,0},
				{1,0,5,4,0,5},
				{0,3,0,4,0,2},
				{0,0,0,5,2,0}
		};
		
		findMST(matrix,V);
		
		double end = System.currentTimeMillis();
		System.out.println("Total Time Is :"+(end-start)/1000 +"Sec");
	}
}
