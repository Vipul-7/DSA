import java.util.*;
public class SumOfDigit {
    public static int sod(int n) {
        int sum = 0 ;

        while(n > 0){
        int lastDigit = n % 10 ;
        sum += lastDigit ;
        n /= 10 ;
        }
        
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println(sod(n));
    }
}
