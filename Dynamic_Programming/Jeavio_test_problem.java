
/*
find maximum possible length of symmetrical substring. you can replace '?' with '<' or '>'.
symetrical string means "<>" , "<<>>" , "<<<>>>".

examples - 
* 1 - "<<?" -> 2
* 2 - "<><<<??>" -> 6
* 3 - "??????" - 6
*/
import java.util.Arrays;

public class Jeavio_test_problem {

    public static void main(String[] args) {
        String s1 = "<<?", // 2
                s2 = "<><<<??>", // 6
                s3 = "??>><>", // 4
                s4 = ">><<??>>", // 6
                s5 = "??????", // 6
                s6 = "<><???>", // 4
                s7 = "??>><>";// 4

        int dp[][][] = new int[50][50][50];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        // System.out.println(s1 + " - " + helper(0, s1, 0, 0, dp));
        // System.out.println(s2 + " - " + helper(0, s2, 0, 0, dp));
        // System.out.println(s3 + " - " + helper(0, s3, 0, 0, dp));
        // System.out.println(s4 + " - " + helper(0, s4, 0, 0, dp));
        // System.out.println(s5 + " - " + helper(0, s5, 0, 0, dp));
        // System.out.println(s6 + " - " + helper(0, s6, 0, 0, dp));
        System.out.println(s7 + " - " + helper(0, s7, 0, 0, dp));
    }

    public static int helper(int idx, String s, int opening, int closing, int dp[][][]) {
        // System.out.println(opening + " " + closing);
        if (idx == s.length()) {
            return Math.min(opening, closing) * 2;
        }

        if (dp[idx][opening][closing] != -1) {
            // System.out.println("Namaste");
            return dp[idx][opening][closing];
        }

        if (closing >= opening && closing != 0) {
            // System.out.println(idx + " " + opening + " " + closing);
            return Math.max((opening * 2), helper(idx, s, 0, 0, dp));
        }

        int ans = 0;
        if (s.charAt(idx) == '<') {
            ans = helper(idx + 1, s, opening + 1, closing, dp);
        } else if (s.charAt(idx) == '>') {
            ans = helper(idx + 1, s, opening, closing + 1, dp);
        } else {
            ans = Math.max(helper(idx + 1, s, opening + 1, closing, dp), helper(idx + 1, s, opening, closing + 1, dp));
        }

        return dp[idx][opening][closing] = ans;
    }
}
