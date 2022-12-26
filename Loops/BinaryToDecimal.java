import java.util.*;
public class BinaryToDecimal {

    public static void biTodec(int biNum) {
        int MyNum = biNum ;
        int decNum = 0;
        int pow = 0;
        

        while(biNum > 0){  // Don't know how ?
            int lastDigit = biNum % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            biNum /= 10;
            pow++;
        }
        System.out.println("Decimal of " + MyNum +" is - "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter decimal-");
        int n = sc.nextInt();
       
        biTodec(n);

    }
}
