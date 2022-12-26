package Array_List;
import java.util.*;

public class gh {
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
        

        for(int i = 0 ; i < arr.size() ; i++){
            for(int j = i+1 ; j < arr.size() ; j++){
                if(arr.get(i) != arr.get(j) && arr.get(i)+1 != arr.get(j) && arr.get(i)-1 != arr.get(j)){
                ans.add(arr.get(i));
                break ;
                }
            }
        }


        System.out.println(ans);
    }
}
