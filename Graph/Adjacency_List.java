package Graph;

import java.util.LinkedList;
import java.util.Scanner;

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

    public static void main(String[] args) {

        int v = 5;
        int e = 6;

        Adjacency_List list = new Adjacency_List(v);

        list.addEdge(1, 2);
        list.addEdge(1, 4);
        list.addEdge(2, 3);
        list.addEdge(3, 4);
        list.addEdge(0, 4);
        list.addEdge(0, 3);

        display();

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
