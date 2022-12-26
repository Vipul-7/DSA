package Greedy_Algorithms.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class chainOfPairs_max_length {
    public static void main(String[] args) { // O(nlogn)
        int arr[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1 ;
        int prevEnd  = arr[0][1] ;
        
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i][0] >= prevEnd){
                chainLength ++ ;
                prevEnd = arr[i][1];
            }
        }
        System.out.println(chainLength);
    }

}
