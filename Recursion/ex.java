package Recursion;

public class ex {
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2} ;
        occ(0, 2, arr);
        eng_name(2134);
        System.out.println(length(0, "Vipul"));
        
    }

    // which place occurence
    public static void occ(int i, int key, int arr[]) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        occ(i + 1, key, arr);
    }

    // convert number to english name (e.g.-29 then "two nine")
    static String digits[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    public static void eng_name(int num) {
        if (num == 0) {
            return;
        }
        int LastDigit = num % 10;
        eng_name(num / 10);
        System.out.print(digits[LastDigit] + " ");
    }

    // find length of string
    public static int length(int i, String str) {
        if (i == str.length()) {
            return i;
        }

        return length(i + 1, str);

    }

    
}
