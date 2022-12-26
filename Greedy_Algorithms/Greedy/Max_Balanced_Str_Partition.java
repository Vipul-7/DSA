// examples --> maximum string partiotion for balanced substring

package Greedy_Algorithms.Greedy;

public class Max_Balanced_Str_Partition {
    public static void main(String[] args) {
        String str = "LRRRLLRLLRL";

        int l = 0 ;
        int r = 0 ;

        int max_ways = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'L')
            l++ ;

            else
            r++ ;

            if(l == r){
               max_ways ++ ;
               l = 0 ;
               r = 0 ;
            }
        }

        System.out.println(max_ways);
    }
}
