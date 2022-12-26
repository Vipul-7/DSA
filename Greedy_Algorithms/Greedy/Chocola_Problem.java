// minimum cost for cuts the single pices in dairy milk choclate

package Greedy_Algorithms.Greedy;

import java.util.Arrays;
import java.util.Collections;

public class Chocola_Problem {
    public static void main(String[] args) {
        int n = 4 ,
        m = 6 ;

        Integer horCost[] = {4,1,2} ; // n-1
        Integer verCost[] = {2,1,3,1,4} ; // m-1

        // sort in decreasing order
        Arrays.sort(horCost,Collections.reverseOrder());
        Arrays.sort(verCost, Collections.reverseOrder());

        int h = 0 ,  v = 0 ; // tracking the hori. & ver. arrays

        int hp = 1 , vp = 1  ; // how many cuts on chocalte 

        int cost = 0 ; // minimum cost

        while(h < horCost.length && v < verCost.length){
            if(horCost[h] >= verCost[v]){
               cost += (horCost[h] * vp ) ; // * vp means jetla vertical cuts hoy aena badha par horizontal cuts
               hp ++ ; 
               h ++ ;
            }
            else{
                cost += (verCost[v] * hp);
                vp ++ ;
                v++ ;
            }
        }

        // v[] empty but h[] not then
        while (h < horCost.length) {
            cost += (horCost[h] * vp ) ; 
            hp ++ ; 
            h ++ ;
        }

        // h empty but v[] not then
        while (v < verCost.length) {
            cost += (verCost[v] * hp);
            vp ++ ;
            v++ ;
        }

        System.out.println("minimum cost for cuts is = "+cost);
    }
}
