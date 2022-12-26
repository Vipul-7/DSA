package Greedy_Algorithms.Greedy;
import java.util.*;


public class Indian_Coins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 598 ;

        ArrayList<Integer> list  = new ArrayList<>();

        Arrays.sort(coins,Collections.reverseOrder());

        int min = 0;  // minimum notes to be given

        for(int i = 0 ; i < coins.length ; i++){
            if(coins[i] <= amount){
                while (coins[i] <= amount) {
                    list.add(coins[i]);
                    amount -= coins[i] ;
                    min ++ ;
                }
            }
        }

        System.out.println(min);

        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
