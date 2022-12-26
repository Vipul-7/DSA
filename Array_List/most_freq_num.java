// find most frequent number in arraylist

package Array_List;
import java.util.ArrayList ;

public class most_freq_num {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(100);
        arr.add(200);
        arr.add(1);
        arr.add(100);

        mfn(arr,1);

    }

    public static void mfn(ArrayList<Integer> arr,int key){
        int result[] = new int[1000];
        
        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) == key){
                result[arr.get(i+1)-1]++ ;
            }
        }

        int max = Integer.MIN_VALUE ;
        int ans = 0;
        for (int i = 0; i < result.length; i++) {
            if(result[i] > max){
                max = result[i] ;
                ans = i+1;
            }
        }
        System.out.println(ans);
        
        
    }
}
