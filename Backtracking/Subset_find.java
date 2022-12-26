package Backtracking;

public class Subset_find {
    public static void main(String[] args) {
        Subset("abc", "", 0);
    }

    public static void Subset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Fie");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // choice is yes
        Subset(str, ans + str.charAt(i), i + 1);

        // no
        Subset(str, ans, i + 1);
    }
}
