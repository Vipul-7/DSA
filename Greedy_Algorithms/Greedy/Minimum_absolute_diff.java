package Greedy_Algorithms.Greedy;

import java.util.Arrays;

public class Minimum_absolute_diff {
    public static void main(String[] args) {
        int a1[]= {4,1,8,7};
        int a2[]={2,3,6,5};

        Arrays.sort(a1);
        Arrays.sort(a2);

        int sumMin  = 0 ;
        for (int i = 0; i < a2.length; i++) {
            // if(a1[i] >= a2[i])
            // sum += a1[i] - a2[i] ;
            // else
            // sum += a2[i] - a1[i] ;
            
            sumMin += Math.abs(a1[i]-a2[i]) ; // for finding the absoulate value
        }
        System.out.println(sumMin);
    }
}