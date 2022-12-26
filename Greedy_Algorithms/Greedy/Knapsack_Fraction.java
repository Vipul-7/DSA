package Greedy_Algorithms.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack_Fraction {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30} ;
        int capacity = 50 ;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i] ;
        }

    

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1])) ; // sort the 2d array



        int finalVal = 0 ;
        for(int i= ratio.length-1 ; i >= 0 ; i--){
            int index = (int)ratio[i][0] ;  // 

            if(capacity >= weight[index]){ // add full value because capacity >= weight[i]
                finalVal += val[index] ;
                capacity -= weight[index] ;
            }
            else{ // store the fraction of value and length according to reqired gap on capacity
                finalVal += (ratio[i][1] * capacity) ;
                capacity = 0; 
                break ;
            }
        }

        System.out.println("final value for maximum value is - "+finalVal);
    }
}
