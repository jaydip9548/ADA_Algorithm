package Graph;

import java.util.LinkedList;
import java.util.Stack;

public class L3_Undirected_DFS_Cycle_Detection {
    public static LinkedList<Integer> adj[];
    public static boolean vis[];

    public L3_Undirected_DFS_Cycle_Detection(int v) {
        adj = new LinkedList[v];
        vis = new boolean[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public static void main(String[] args) {

        int node = 4;
        L3_Undirected_DFS_Cycle_Detection u = new L3_Undirected_DFS_Cycle_Detection(node);

//        Cycle Not present
//        addEdge(0,1);
//        addEdge(1,2);
//        addEdge(3,2);

//        Cycle Present
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(0, 2);
        addEdge(2, 3);


        boolean b = if_UndirectedGraph_HasCycle();
        System.out.println(b);
    }

    private static boolean if_UndirectedGraph_HasCycle() {

        boolean vis[] = new boolean[adj.length];

        Stack<Integer> stack = new Stack<>();

        int curr = -1, parent = -1;

        stack.push(0);
        vis[0] = true;

        while (!stack.isEmpty()) {

            parent = curr;
            curr = stack.pop();

            for (int neighbor : adj[curr]) {
                if (!vis[neighbor]) {
                    stack.push(neighbor);
                    vis[neighbor] = true;
                } else if (neighbor != parent && vis[neighbor] == true) {
                    return true;
                }

            }
        }
        return false;
    }


}
