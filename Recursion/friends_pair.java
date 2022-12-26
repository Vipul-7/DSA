package Recursion;

public class friends_pair {
    public static void main(String[] args) {
        System.out.println(pair(5));
    }

    public static int pair(int n) {
        if(n==1 || n==2){
            return n ;
        }
        // pair(n-1) for every person is stand single
        // n-2 means one oerson make the pair with choices they have n-1(uske sivay sare)
        // sum of this is total ways of pair we can made
        return pair(n-1)+((n-1)*pair(n-2));
    }
}
