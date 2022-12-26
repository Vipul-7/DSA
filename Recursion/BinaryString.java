//print binary string of size N without consecutive ones

package Recursion;

public class BinaryString {
    public static void main(String[] args) {
        str(3,0 , new String(""));
    }

    public static void str(int n, int lastPlace, String str) {
        if(n == 0){
            System.out.println(str);
            return ;
        }
        str(n-1, 0, str+"0");
        if(lastPlace == 0){
            str(n-1, 1, str+"1");
        }
    }
}
