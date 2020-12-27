import java.util.*;

public class BFS {

	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		// No. of Nodes
		int V = 4;

		// If node 0 and 1 is connected then put matrix[0][1] = 1 , same for all

		// node  | 0  1  2  3
//		-----------------------
//		      0  | 0  1  1  0
//		      1  | 0  0  1  0
//		      2  | 1  0  1  1
//		      3  | 0  0  0  1
		//
		int matrix[][] = { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 1, 0, 1, 1 }, { 0, 0, 0, 1 } };

		int visited[] = { 0, 0, 0, 0 };

		ArrayList<Integer> queue = new ArrayList<Integer>();

		// Add the start node in the node arrayList
		queue.add(0);

		// Set the Visited value of node 0 in visited array
		visited[0] = 1;

//		Dequeue node 0
		int node = queue.remove(0);
		System.out.println("BFS Order (Starting From 0th node) : ");
		System.out.println(node);

		while (true) {
			for (int x = 0; x < visited.length; x++) {
				if (matrix[node][x] == 1 && visited[x] == 0) {
					visited[x] = 1;
					queue.add(x);
				}
			}
			if (queue.isEmpty()) {
				break;
			} else {
				node = queue.remove(0);
				System.out.println(node);
			}
		}

		double end = System.currentTimeMillis();
		System.out.println("Total Time : " + (end - start) + " ms");

	}
}
