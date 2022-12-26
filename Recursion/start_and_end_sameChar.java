// doubt

package Recursion;

public class start_and_end_sameChar {
    public static void main(String[] args) {
        
        String str = "abcab";
        System.out.println(same_character(str, 0, str.length()-1, str.length()));
    }

    // find count that string starting and ending with same character
    public static int same_character(String str, int i, int j, int n) {
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;

        int r = same_character(str, i + 1, j, n - 1) +
                same_character(str, i, j - 1, n - 1) +
                same_character(str, i + 1, j - 1, n - 2);

        if(str.charAt(i) == str.charAt(j))
        r++ ;
        
        return r ;
    }

}
