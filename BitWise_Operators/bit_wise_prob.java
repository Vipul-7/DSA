
import java.security.PublicKey;
import java.util.*;

public class bit_wise_prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number-");
        int n = sc.nextInt();

        System.out.print("Which bit you want to .....-");
        int i = sc.nextInt();
        // odd_or_even(n);
        // get_i_th_bit(n);
        // System.out.println(set_i_th_bit(n));
        // System.out.println(clear_i_th_bit(n,i));
        // System.out.println(update_i_th_bit(n,i));
        // System.out.println(clear_last_i_th_bit(n, i));
        // System.out.println(clear_range(n));
        // System.out.println(power_or_not(n));
        // System.out.println(count_set(n));
        System.out.println(fast_explonation(n, i));
    }

    // check number even or odd
    public static void odd_or_even(int n) {
        if ((n & 1) == 0) { // ex : 8 => 1000 & 1 - 0001 ===== 0
            System.out.println(n + " is even.");
        } else
            System.out.println(n + " is odd");

    }

    // get ith bit
    public static void get_i_th_bit(int n, int i) {

        if ((n & (1 << i)) == 0) { // (1<<i) called as bit mask
            System.out.println("ith bit - " + 0);
        } else
            System.out.println("ith bit - " + 1);
    }

    // set ith bit 1 and print result
    public static int set_i_th_bit(int n, int i) {
        return n | (1 << i);
    }

    // clear ith bit means do ith bit 0
    public static int clear_i_th_bit(int n, int i) {
        return n & ~(1 << i);
    }

    // update ith bit
    public static int update_i_th_bit(int n, int i) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new bit-");
        int newbit = sc.nextInt();

        // if(newbit == 0){
        // clear_i_th_bit(n);
        // }
        // else
        // set_i_th_bit(n);

        n = clear_i_th_bit(n, i);
        int bitMask = newbit << i;
        return bitMask | n;
    }

    // Clear last ith bit
    public static int clear_last_i_th_bit(int n, int i) {
        return n & (~0) << i;
    }

    // clear the range for given range
    public static int clear_range(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i :");
        int i = sc.nextInt();
        System.out.println("Enter j :");
        int j = sc.nextInt();

        int a = (~0) << j + 1;
        int b = 1 << i - 1;

        int bitMask = a | b;
        return n & bitMask;
    }

    // check if number is power of 2 or not
    public static boolean power_or_not(int n) {

        // ex : 8 - 1000 & 7 - 0111 ===== 0
        return (n & (n - 1)) == 0;
    }

    // count set number in bit
    public static int count_set(int n) {
        /*
         * time complexity - O(logn) +1 (because decimal to binary conversion will take
         * (logn) time
         */
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;

        }
        return count;
    }

    // fast explonation ( find power with logn+1 time complexity)
    public static int fast_explonation(int a, int n) { // n is base and i is power
        int ans = 1;
        while (n > 0) {

            if ((n & 1) != 0) {
                ans *= a;
            }

            a *= a;
            n = n >> 1;

        }
        return ans;
    }
}
