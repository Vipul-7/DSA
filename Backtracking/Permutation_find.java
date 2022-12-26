package Backtracking;

public class Permutation_find {  // time complexity is - n * pow(2,n) && space complexity is o(n)
    public static void main(String[] args) {
        Permutation("abc", "");
    }

    public static void Permutation(String str, String ans) {
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return ;
        }

        // recursion
        for(int i = 0 ; i < str.length() ; i++){
            char curr = str.charAt(i) ;

            // remove ith char and create string without character i
            String newStr  = str.substring(0,i) + str.substring(i+1) ; 

            Permutation(newStr, ans+str.charAt(i)); // add current char at ans
        }
    }
}
