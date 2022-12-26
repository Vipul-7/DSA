// remove the char in string that is want to print again

package Recursion;

public class Remove_duplicates_in_String {
    public static void main(String[] args) {
        rds("vippuuil", 0, new StringBuilder() , new boolean[26]);
    }

    public static void rds(String s , int i , StringBuilder sb, boolean arr[]) {

        //base case
        if(i == s.length()){
            System.out.println(sb);
            return ;
        }

        // work
        int index = s.charAt(i)-'a' ;
        if(arr[index] == true){
            rds(s, i+1, sb, arr);
        }
        else{
            arr[index] = true ;
            rds(s, i+1, sb.append(s.charAt(i)), arr);
        }
    }
}
