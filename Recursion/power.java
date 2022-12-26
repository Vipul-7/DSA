package Recursion;

public class power {
    public static void main(String[] args) {
        // System.out.println(power_of_x(2,5)); 
        System.out.println(power_optimized(2, 5));
    }

    // time compelxity - o(n)

    public static int power_of_x(int x , int n) {
        if(n == 0){
            return 1 ;
        }
        return x * power_of_x(x , n -1) ;
    }

    // optimized
    // O(logn)
    public static int power_optimized(int x ,int n) {
        if( n == 1){
            return x ;
        }
        
        int halfPower = power_optimized(x, n/2);
        int halfPowerSq = halfPower * halfPower ;
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq ;
        }
        return halfPowerSq ;
    }
}
