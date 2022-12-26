// this for sort rotated array
package Array_List;
import java.util.ArrayList;

public class pair_sum_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(11);
        arr.add(15);
        arr.add(37);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        
        System.out.println(pair_sum(arr, 15));
    }

    public static boolean pair_sum(ArrayList<Integer> arr , int target) {
        int bp = -1 ; // in next steps we will use bp

        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) > arr.get(i+1)){
                bp = i ;
                break ;
            }
        }

        int lp = bp+1 ;
        int rp = bp ;
        while (lp != rp) {
            // case 1
            if(arr.get(lp) + arr.get(rp) == target)
            return true ;

            // case 2
            else if(arr.get(lp) + arr.get(rp) > target)
            rp = (arr.size() + rp -1 ) % arr.size() ; // rp will rotate in array and value(rp) will decreases

            /// case 3
            else
            lp = (lp+1) % arr.size() ; // lp rotate
        }
        return false ;
    }


}
