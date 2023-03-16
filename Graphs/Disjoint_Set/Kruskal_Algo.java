package Graphs.Disjoint_Set;

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal_Algo {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalMST(edges, V);
    }

    public static void kruskalMST(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1; i++) {
            Edge e = edges.get(i);

            int parA = find(e.source);
            int parB = find(e.destination);

            if (parA != parB) {
                Union(e.source, e.destination);
                mstCost += e.weight;
                count++;
            }
        }

        System.out.println(mstCost);
    }

    static class Edge implements Comparable<Edge> {
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.weight - e2.weight;
        }
    }

    static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4; // vertecis
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    static void init() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    static int find(int key) {
        if (parent[key] == key) {
            return key;
        }
        return parent[key] = find(parent[key]); // path compression
    }

    static void Union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);

        if (rank[parentA] == rank[parentB]) {
            parent[parentB] = parentA; // or parent[parentA] = parentB
            rank[parentA]++;
        } else if (rank[parentA] > rank[parentB]) {
            parent[parentB] = parentA;
        } else {
            parent[parentA] = parentB;
        }
    }

}
