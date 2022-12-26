// even or odd by function

import java.util.*;
public class FunctionQuestion {
    public static boolean isEven(int n) {
        
       if(n % 2 == 0){
       return true ;
       }
       else
       return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    System.out.println(isEven(p));
    }
}
