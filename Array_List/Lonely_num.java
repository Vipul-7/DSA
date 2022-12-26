// num is lonely when that has     not more than one time | not adjacent ( means not num-1 or num +1)
package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Lonely_num {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10) ;
        arr.add(6);
        arr.add(5);
        arr.add(8);

        Lonely(arr);
    }

    public static void Lonely(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(arr) ;

        for(int i = 1 ; i < arr.size()-1 ; i++){
            if(arr.get(i-1) + 1 < arr.get(i) && arr.get(i+1) > arr.get(i)+1){
                ans.add(arr.get(i)) ;
            }
        }

        if(arr.size() == 1)
        ans.add(arr.get(0));
        if(arr.size() > 1){
            // for first element of arraylist
            if(arr.get(0)+1 < arr.get(1))
            ans.add(arr.get(0)) ;

            // for last element of arraylist
            if(arr.get(arr.size()-2) + 1 < arr.get(arr.size()-1) )
            ans.add(arr.get(arr.size()-1));
        }

        System.out.println(ans);
    }
}
