package Graphs.Disjoint_Set;
// disjoint set or Union find

public class Disjoint_set {
    static int n = 7;
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
        return find(parent[key]);
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

    public static void main(String[] args) {
        init();
        Union(1, 3);
        System.out.println(find(3));
        Union(2, 4);
        Union(3, 6);
        Union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        Union(1, 5);
    }
}
