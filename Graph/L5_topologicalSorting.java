package Graph;
import java.util.LinkedList;
import java.util.Stack;

// Data Structure : Stack

// If i stored in Post ordr in stack: bcs if suppose edge from u to v then we can get edge u before v;

// if not use use stack : would get odering element which doesnt follow topological edge

// why not preorder : if use preorder ex... preoder then get 1 , 2 and 3 (property not followed here u -> v)
// 1 is depend on 2
// 1 --> 2 <-- 3

public class L5_topologicalSorting {
    public static LinkedList<Integer> adj[];
    public static boolean vis[];

    public L5_topologicalSorting(int v) {
        adj = new LinkedList[v];
        vis = new boolean[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    public static void main(String[] args) {
        int v = 7;
        L5_topologicalSorting l1 = new L5_topologicalSorting(v);

        l1.addEdge(0, 1);
        l1.addEdge(1, 2);
        l1.addEdge(2, 3);
        l1.addEdge(0, 3);
        l1.addEdge(4, 3);
        l1.addEdge(4, 5);
        l1.addEdge(4, 6);
        l1.addEdge(5, 6);

        boolean vis[] = new boolean[v];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < adj.length; i++) {
            if (vis[i] == false) {
                topologicalSort(vis, st, i);
            }
        }
        while (st.size() > 0) {
            System.out.println(st.pop());
        }
    }
    public static void topologicalSort(boolean vis[], Stack<Integer> st, int src) {
        vis[src] = true;

        for (Integer neibour : adj[src]) {
            if (vis[neibour] == false) {
                topologicalSort( vis, st, neibour);
            }
        }
        st.push(src);
    }
}
