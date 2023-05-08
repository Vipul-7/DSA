public class assignment {
    public static void main(String[] args) {
        swap(2, 3);
        add_one(2);
        convertUpperToLower('A');
    }

    // swap two numbers without using third variable
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + " b = " + b);
    }

    // add 1 to a number using bitwise operator
    public static void add_one(int n) {
        System.out.println("n + 1 is " + -(~n));
        // because not(~) will stored in 2's complement (1's compelement+1) form but
        // negative. so we have to negate it again to get the result
    }

    public static void convertUpperToLower(char c) {
        System.out.println("Lower case is " + (char) (c | ' '));
    }
}
