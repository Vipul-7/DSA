import java.util.*;
public class DecimalToBinary {

    public static void dectobi(int decNum) {
        int myNum = decNum ;
        int biNum = 0;
        
        int pow = 0;
        while (decNum > 0) {
            int rem = decNum % 2 ;
            
            
            biNum = biNum + (rem * (int)Math.pow(10,pow ));
            
            pow++;
            decNum /= 2;
        }
        
       
        System.out.print("binary form of "+myNum+" is "+biNum );
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal-");
        int n = sc.nextInt();
        dectobi(n);
    }
}
