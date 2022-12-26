// read int list and print the even and odd sum

import java.util.*;
public class WhileVSDoWhile {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n;
    boolean i=false ;
    int EvenSum = 0;
    int OddSum = 0; 

    do{
        System.out.print("Enter number:");
        n = sc.nextInt();

        if(n%2==0){
            EvenSum += n; 
        }
        else 
            OddSum += n ;
        System.out.println("--->Wanna Continue\nthen press'true'\nor\nget result then ''false'");
        i = sc.nextBoolean();
    }while(i == true);

    System.out.println("Even sum is:"+EvenSum);
    System.out.println("Odd sum is:"+OddSum);
   } 
}
