package Greedy_Algorithms.Greedy; 

import java.util.ArrayList;
import java.util.Arrays;

public class Activity_selection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};


        // step 1 : sort the end array
        Arrays.sort(end);


        ArrayList<Integer> list = new ArrayList<>();

        int max = 0 ;

        // first activity
        max = 1 ;
        list.add(0) ;
        int prevEnd = end[0];

        // from second to ...
        for(int i = 1 ; i < start.length ; i++){
            if(start[i] >= prevEnd){
                max ++ ; 
                list.add(i);
                prevEnd = end[i];
            }
        }


        System.out.println(max);
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println("A"+list.get(i));
        }
    }

}
