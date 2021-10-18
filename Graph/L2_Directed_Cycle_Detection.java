package Graph;

import java.util.LinkedList;

// Graph.DFS Algo

public class L2_Directed_Cycle_Detection {

    public static LinkedList<Integer> adj[];
    public static boolean vis[], recursiveStack[];


    public L2_Directed_Cycle_Detection(int v) {
        adj = new LinkedList[v];
        vis = new boolean[v];
        recursiveStack = new boolean[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    private static boolean ifDirectedGraphHasCycle() {

        for (int i = 0; i < adj.length; i++) {
            if (cycleExists(i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean cycleExists(int index) {
//        check if it presents in recursiveStack means we found cycle if it present
        if (recursiveStack[index]) return true;
//        if we found in visited array means we will not find any cycle so no need to check its neighbor
        if (vis[index]) return false;

//        if above ele is not in recursiveStack and vis array then we add it not these array
        vis[index] = true;
        recursiveStack[index] = true;

        for (int neighbor : adj[index]) {
            if (cycleExists(neighbor)) {
                return true;
            }
        }
//        if cycleExists() return false then we should remove that element from recursiveStack Array
        recursiveStack[index] = false;
        return false;

    }

    public static void main(String[] args) {

        int node = 4;
//        initialize adj, visited and recursiveStack array
        L2_Directed_Cycle_Detection dc = new L2_Directed_Cycle_Detection(node);

//        Directed Graph detect cycle is there or not

        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
//        addEdge(2, 0);
//        addEdge(0, 3);
//        addEdge(3, 4);
//        addEdge(4, 0);

        System.out.println(ifDirectedGraphHasCycle());

    }


    private static void display() {
        for (int j = 0; j < adj.length; ++j) {
            System.out.print(j + " --> ");
            for (int i = 0; i < adj[j].size(); i++) {
                System.out.print(adj[j].get(i) + " ");
            }
            System.out.println();
        }
    }
}
