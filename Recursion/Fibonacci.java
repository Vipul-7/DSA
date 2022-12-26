package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    
    // time complexity is exponential means o(pow(2,n))
    // Space complexity is o(n)
    public static int fibonacci(int n) {

        if(n == 0 || n==1){
            return n;
        }

        int final_fibo = fibonacci(n-1) + fibonacci(n-2)  ;
        return final_fibo;
    }
}
