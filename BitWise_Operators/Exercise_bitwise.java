import java.util.Scanner;

public class Exercise_bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number - ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number( if needed) - ");
        int n2 = sc.nextInt() ;
        
        // Swap_with_no_third_variable(n1, n2);
        // add_one(n1);
        upper_to_lower();
    }

    // swap two number without taking any third variable in bit
    public static void Swap_with_no_third_variable(int n1 , int n2) {
        n1 ^= n2 ;
        n2 ^= n1  ;
        n1 ^= n2 ;
        
        System.out.println("Now n1 is " + n1 + " and n2 is " + n2);
    }

    // add one into intger
    public static void add_one(int n1) {
        System.out.println(n1+" +1 is "+ -(~n1));
    }

    //uppper case to lower case using bit manupilation
    public static void upper_to_lower() {
        for(char ch = 'A';ch <='Z' ; ch++){
            System.out.print((char) (ch | ' ') + " ");
        }
    }
}
