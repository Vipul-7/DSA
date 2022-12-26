// example 2 -- > Kth largest odd number in a given range

package Greedy_Algorithms.Greedy;


public class Largest_odd_num_in_range {
    public static void main(String[] args) {
        int l = -10 ,r = 10 , k = 8 ;
        System.out.println(Lar_k(l, r, k) );
    }

    public static int Lar_k(int l,int r,int k){
        int odd[] = new int[r+1];

        for (int i = 0; i < odd.length; i++) {
            if(r % 2 != 0){
                odd[i] = r ;
                r -- ;
            }
            else
            r -- ;

            if(i == k-1)
            return odd[i] ;

            if(r == l)
            break ;
        }

        return -1;
    }
}
