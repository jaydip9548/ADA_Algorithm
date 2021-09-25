package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//https://youtu.be/nt8uN6pQrnw


public class Adjacency_List {

    private static LinkedList<Integer> adj[];


    public Adjacency_List(int v) {
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();

        }
    }

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    //    Minimum distance between source and destination
    public static int bfs(int source, int destination) {
        boolean vis[] = new boolean[adj.length];
        int parent[] = new int[adj.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        parent[source] = -1;
        vis[source] = true;

//        System.out.println(source);
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == destination) break;
            for (int neightbor : adj[cur]) {

                if (!vis[neightbor]) {
//                    System.out.println(neightbor);
                    vis[neightbor] = true;
                    q.add(neightbor);
                    parent[neightbor] = cur;
                }
            }
        }

        int cur = destination;
        int distance = 0;
        while (parent[cur] != -1) {
            System.out.print(cur + " -> ");
            cur = parent[cur];
            distance++;
        }
        System.out.print(source);
        return distance;
    }
//    check path exists betn source and destination.

    private static boolean dfsUtil(int source, int destination, boolean vis[]) {

        if (source == destination) return true;

        for (int neighbor : adj[source]) {
            if (!vis[neighbor]) {
                vis[neighbor] = true;
                boolean conn = dfsUtil(neighbor, destination, vis);
                if (conn) return true;
            }
        }
        return true;
    }

    public static void dfs(int s, int d) {
        boolean vis[] = new boolean[adj.length];
        vis[s] = true;
        System.out.println("Possible :" + dfsUtil(s, d, vis));
    }

    public static boolean dfsStack(int source, int destination) {
        boolean vis[] = new boolean[adj.length];

        Stack<Integer> st = new Stack<>();

        st.push(source);
        vis[source] = true;

        while (!st.isEmpty()) {
            int curr = st.pop();

            if (curr == destination) return true;
            for (int neighbor : adj[curr]) {
                if (!vis[neighbor]) {
                    st.push(neighbor);
                    vis[neighbor] = true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int v = 5;
        int e = 6;

        Adjacency_List list = new Adjacency_List(v);

        list.addEdge(0, 1);
        list.addEdge(1, 2);
        list.addEdge(2, 3);
        list.addEdge(3, 4);
        list.addEdge(0, 4);
        list.addEdge(2, 4);

//        display();
        bfs(0, 2);

//        list.addEdge(0, 4);
//        list.addEdge(4, 3);
//        list.addEdge(3, 2);
//        list.addEdge(2, 1);
//        list.addEdge(1, 2);
////        dfs(0, 1);
//        System.out.println("Possible "+dfsStack(0,4));;
    }

    static void display() {
        int n = adj.length;

        for (int i = 0; i < n; i++) {
            System.out.print("Node " + i + " to ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
