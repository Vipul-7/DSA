import java.util.*;
public class IncomeTaxExample {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Your income in Lacks:");
      float incom = sc.nextFloat();

      if(incom <= 5.0){
        System.out.println(incom);
      }
      else if(incom > 5 && incom < 10.0){
        System.out.println(incom+(0.20*incom));
      }
      else 
      System.out.println(incom+(0.30*incom));
    }
}
