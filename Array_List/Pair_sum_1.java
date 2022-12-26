package Array_List;

import java.util.ArrayList;

public class Pair_sum_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(pair_sum_brute_force(arr, 5));
        System.out.println(print_sum_2pointer_approach(arr, 5));
    }

    // brute force
    public static boolean pair_sum_brute_force(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target) {
                    System.out.println(i + " and " + j);
                    return true;
                }

            }
        }
        return false;
    }

    // 2 pointer approach
    public static boolean print_sum_2pointer_approach(ArrayList<Integer> arr, int target) {
        int lp = 0 ;
        int rp = arr.size()-1 ;

        while (lp != rp) {
            if(arr.get(lp) + arr.get(rp) == target)
            return true;

            else if(arr.get(lp) + arr.get(rp) < target)
            lp++ ;

            else
            rp -- ;
        }
        return false ;
    }
}
