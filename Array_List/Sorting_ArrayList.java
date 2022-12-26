package Array_List;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>() ;
        v.add(23);
        v.add(43);
        v.add(14);
        v.add(57);
        v.add(31) ;

        System.out.println(v);

        ascending(v);
        System.out.println(v);

        descending(v);
        System.out.println(v);
    }

    public static void ascending(ArrayList<Integer> p) {
        Collections.sort(p);
    }

    public static void descending(ArrayList<Integer> b) {
        Collections.sort(b , Collections.reverseOrder()) ;
    }
}



