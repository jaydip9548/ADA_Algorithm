package Graph;

import java.util.ArrayList;

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double start = System.currentTimeMillis();

		int matrix[][] = { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 } };

		// visited Array
		int visited[] = { 0, 0, 0, 0 };

//		Add the start node to the stack array
		ArrayList<Integer> stack = new ArrayList<Integer>();
		stack.add(0);

//		Set the visited value of node 0 to visited
		visited[0] = 1;

//		Pop the Stack

		int node = stack.remove(stack.size() - 1);
		System.out.println("Graph.DFS Order is(Starting From 0th Node) : ");
		System.out.println(node);

		while (true) {
			for (int x = 0; x < visited.length; x++) {
				if (matrix[node][x] == 1 && visited[x] == 0) {
					visited[x] = 1;
					stack.add(x);
				}
			}
			if (stack.size() == 0) {
				break;
			} else {
				node = stack.remove(stack.size() - 1);
				System.out.println(node);
			}
		}

		double end = System.currentTimeMillis();
		System.out.println("Total Time is : " + (end - start) + " ms");
	}

}
