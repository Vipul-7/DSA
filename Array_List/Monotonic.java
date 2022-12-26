// check if the given string is increasing monotonic or decreasing monotonic

package Array_List;

import java.util.ArrayList;

public class Monotonic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(6);
        arr.add(4);

        System.out.println(monotic(arr));
    }

    public static boolean monotic(ArrayList<Integer> arr) {
        boolean inc  = true ,
        dec = true ;
        for(int i = 0 ; i < arr.size()-1 ; i++){
            if(arr.get(i) > arr.get(i+1))
            inc = false ;

            if(arr.get(i) < arr.get(i+1))
            dec = false;
        }

        return inc || dec ;
    }
}
