package Dynamic_Programming;

import java.util.Arrays;

/*
Leetcode 2719 -> Count of Integer
 * You are given two numeric strings num1 and num2 and two integers max_sum and min_sum. We denote an integer x to be good if:

num1 <= x <= num2
min_sum <= digit_sum(x) <= max_sum.
Return the number of good integers. Since the answer may be large, return it modulo 109 + 7.

Note that digit_sum(x) denotes the sum of the digits of x.
 */

// reference -- https://codeforces.com/blog/entry/53960

public class digitDP {
    public static void main(String[] args) {
        System.out.println(count("1", "12", 1, 8)); // 11
    }

    static int mod = 1000000007;
    static int dp[][][] = new int[23][401][2];

    public static int count(String num1, String num2, int min_sum, int max_sum) {
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 401; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        int ans = digitDp(num2, min_sum, max_sum, 0, 1, 0); // find for 0 to b

        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 401; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        ans -= digitDp(num1, min_sum, max_sum, 0, 1, 0); // substract 0 to a

        int digitSum = getDigitSum(num1);
        if (digitSum >= min_sum && digitSum <= max_sum) { // we substracted from [0] to [a] but we need a means our
                                                          // range is [a] to [b] included. So, instead of string
                                                          // [num -1 OR a -1] passing parameter we can manually find
                                                          // the digit sum for the [a] and then add it if min and
                                                          // max sum condition satisfy
            ans++;
        }

        ans %= mod;
        return (ans + mod) % mod;
    }

    private static int digitDp(String nums, int minSum, int maxSum, int currSum, int tight, int idx) {
        if (idx == nums.length()) {
            return (currSum >= minSum && currSum <= maxSum) ? 1 : 0;
        }

        if (dp[idx][currSum][tight] != -1) {
            return dp[idx][currSum][tight];
        }

        int ans = 0;
        int end = (tight == 1) ? nums.charAt(idx) - '0' : 9; // if tight is true then we have only option is choose
                                                             // from 0 to curr number(at index idx)

        for (int i = 0; i <= end; i++) {
            int newTight = (tight == 1 && i == end) ? 1 : 0; // if the i is the last bound and tight then next
                                                             // recursive call's tight should be tight
            ans += digitDp(nums, minSum, maxSum, currSum + i, newTight, idx + 1);
            ans %= mod;
        }

        return dp[idx][currSum][tight] = ans;
    }

    private static int getDigitSum(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i) - '0';
        }
        return res;
    }
}
