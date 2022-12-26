import java.util.Scanner;

public class fac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number - ");

        int n = sc.nextInt();

        int fac = 1;

        for(int i = n ; i > 1 ; i--){
            fac = i * fac;           
        }
        System.out.println("Factorial of " + n + " is " + fac);
    }
}
