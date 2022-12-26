package Recursion;

public class Print_1_to_10 {
    public static void main(String[] args) {
        print(10);
        System.out.println();
        print_In(9);
    }

    // decreasing order
    public static void print(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }

    // increasing order
    public static void print_In(int n){
        if (n==1) {
            System.out.print(n+" ");
            return ;
        }
        print_In(n-1);
        System.out.print(n+" ");
    }
}

