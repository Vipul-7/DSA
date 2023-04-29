package Graphs.Disjoint_Set;

import java.util.*;

// 1697. Checking Existence of Edge Length Limited Paths
/*
An undirected graph of n nodes is defined by edgeList, where edgeList[i] = [ui, vi, disi] denotes an edge between nodes ui and vi with distance disi. Note that there may be multiple edges between two nodes.

Given an array queries, where queries[j] = [pj, qj, limitj], your task is to determine for each queries[j] whether there is a path between pj and qj such that each edge on the path has a distance strictly less than limitj .

Return a boolean array answer, where answer.length == queries.length and the jth value of answer is true if there is a path for queries[j] is true, and false otherwise.
 */

public class Leetcode_1697 {
    static class UnionFind {
        int parent[];
        int rank[];

        UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];

            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] == x)
                return x;
            return parent[x] = find(parent[x]);
        }

        void join(int x, int y) {
            int parentX = find(x);
            int parentY = find(y);

            if (parentX == parentY)
                return;

            if (rank[parentX] == rank[parentY]) {
                parent[parentY] = parentX;
                rank[parentX]++;
            } else if (rank[parentX] > rank[parentY]) {
                parent[parentY] = parentX;
            } else {
                parent[parentX] = parentY;
            }
        }

        boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }
    }

    public static boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        UnionFind uf = new UnionFind(n);
        int m = queries.length;

        int queriesWithIndex[][] = new int[m][4];
        for (int i = 0; i < m; i++) {
            queriesWithIndex[i][0] = queries[i][0];
            queriesWithIndex[i][1] = queries[i][1];
            queriesWithIndex[i][2] = queries[i][2];
            queriesWithIndex[i][3] = i;
        }

        Arrays.sort(edgeList, (a, b) -> a[2] - b[2]);
        Arrays.sort(queriesWithIndex, (a, b) -> a[2] - b[2]);

        boolean result[] = new boolean[m];
        int edgeIndex = 0;

        for (int i = 0; i < m; i++) {
            int p = queriesWithIndex[i][0];
            int q = queriesWithIndex[i][1];
            int limit = queriesWithIndex[i][2];
            int realIndex = queriesWithIndex[i][3];

            while (edgeIndex < edgeList.length && edgeList[edgeIndex][2] < limit) {
                uf.join(edgeList[edgeIndex][0], edgeList[edgeIndex][1]);
                edgeIndex++;
            }

            result[realIndex] = uf.isConnected(p, q);
        }

        return result;
    }

    public static void main(String[] args) {
        boolean[] arr = distanceLimitedPathsExist(5,
                new int[][] { { 0, 1, 10 }, { 1, 2, 5 }, { 2, 3, 9 }, { 3, 4, 13 } },
                new int[][] { { 0, 4, 14 }, { 1, 4, 13 } });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
