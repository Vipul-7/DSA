// Palindrome means front and rear of number have to same then ...

import java.util.*;

public class Palindrome {
    public static boolean Palindrome(int n) {
        int rev = 0 ;
        int number  =  n ; // use this because n will change in while loop

        while (n > 0) {
            int last_digit =  n % 10 ; // Find the last digit of a number
            rev = (rev*10) + last_digit ; // for finding the reverse of whole n
            n /=  10 ; // continue remove last digit
        }
        
        if (rev == number) {  // we want to check first entered number
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number-");
        int n = sc.nextInt();
        System.out.println(Palindrome(n));
    }
}
