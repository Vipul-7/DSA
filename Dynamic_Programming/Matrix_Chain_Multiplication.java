package Dynamic_Programming;

import java.util.Arrays;

public class Matrix_Chain_Multiplication {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int n = arr.length;
        System.out.println(MCM_Recursion(arr, 1, n - 1));

        int [][] dp = new int[n][n];
        for(int i=0; i<n ;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(MCM_Memo(arr, 1, n-1, dp));
    }

    // Recursion
    public static int MCM_Recursion(int[] arr, int i, int j) {
        if (i == j)
            return 0;

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            int cost1 = MCM_Recursion(arr, i, k);
            int cost2 = MCM_Recursion(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            int final_cost = cost1 + cost2 + cost3;

            ans = Math.min(ans, final_cost);
        }

        return ans;
    }

    // Memoization(Top->bottom)
    public static int MCM_Memo(int[] arr, int i, int j,int [][]dp) {
        if (i == j)
            return 0;

        if(dp[i][j]!=-1)
        return dp[i][j];

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            int cost1 = MCM_Memo(arr, i, k,dp);
            int cost2 = MCM_Memo(arr, k + 1, j,dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            int final_cost = cost1 + cost2 + cost3;

            ans = Math.min(ans, final_cost);
        }

        return dp[i][j] = ans;
    }

    //Tabulation(bottom->up)

}
