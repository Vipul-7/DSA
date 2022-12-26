// check if prime or not using function/method

import java.util.*;

public class PrimeOrNot {

    // Number prime or not functon
    public static boolean prime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
            return false;
        }
        return true;

    }

    // printing the prime range
    public static void primerange(int n){
        for(int i = 2 ; i <= n ; i++){
          if(prime(i)==true)
          System.out.print(i+" ");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number-");

        int num = sc.nextInt();
        primerange(num);

    }

}
