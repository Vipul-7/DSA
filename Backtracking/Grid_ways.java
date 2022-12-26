package Backtracking;

public class Grid_ways {
    public static void main(String[] args) {
        System.out.println("total ways- "+grid(0, 0, 3, 3));
    }

    public static int grid(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1)
            return 1;

        else if (i == n || j == n)
            return 0;

        int w1 = grid(i+1, j, n, m);
        int w2 = grid(i, j+1, n, m);
        return w1 + w2 ;
    }
}

