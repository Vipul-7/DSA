import java.util.*;

public class funBasic {
    public static int fac(int b) {
        int fac = 1;
        for(int i = 1 ; i <= b ; i++){
            fac = fac * i ;
        }
        return fac;
    }

    public static int binoCoeff(int p , int q) {
        
        
        int a = fac(p);
        int b = fac(q);
        int c = fac(p-q);

        int BCoeff = a/(b*c) ;
        return BCoeff;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n-");
        int p = sc.nextInt();
        System.out.print("Enter r-");
        int q = sc.nextInt();
        System.out.println("nCr is - "+binoCoeff(p,q));
    }
    
}