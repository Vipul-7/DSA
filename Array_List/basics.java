package Array_List;
import java.util.ArrayList;
public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>() ; // syntax

        // O(1)
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // O(1)
        System.out.println(list.get(2)); // value at __ index

        // O(n)
        list.remove(1);
        System.out.println(list);

        // O(n)
        list.add(1,2) ; // for add value at index
        System.out.println(list);

        // O(n)
        list.set(2, 4) ; // change value at index
        System.out.println(list);

        // O(n)
        System.out.println(list.contains(2)); // true
        System.out.println(list.contains(10)); // false


        System.out.println(list.size()); // length or size of array
        // size is property


        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i)+" ");
        }

    }
}
