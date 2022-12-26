package Array_List;

import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> P = new ArrayList<>() ;

        P.add(1);
        P.add(2);
        P.add(3);
        P.add(4);
        P.add(5);

        int ind1 = 2 ;
        int ind2 = 4 ;

        int temp = P.get(ind1) ;
        P.set(ind1, P.get(ind2)) ;
        P.set(ind2, temp) ;
        
        System.out.println(P);


    }
}
