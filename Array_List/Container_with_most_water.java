// find container with most water stores

package Array_List;

import java.util.ArrayList;

public class Container_with_most_water {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(Store_water(height));    
        System.out.println(Store_water_2(height));    
    }

    // brute force-O(n^2)
    public static int Store_water(ArrayList<Integer> height) {
        int maxWater = 0 ;

        for(int line1 = 0 ; line1 < height.size(); line1++){
            for(int line2 = line1+1 ; line2 < height.size() ; line2++){
                int width = line2 - line1 ;
                int hght = Math.min(height.get(line1),height.get(line2)) ;
               
                int currWater = hght * width ;

                maxWater = Math.max(currWater, maxWater) ;
            }
        }
        return maxWater ;
    }


    // 2 pointer approach
    public static int Store_water_2(ArrayList<Integer> height) {
        int maxWater = 0 ;
        int lp = 0 ;
        int rp  = height.size()-1 ;

        while (lp != rp) {
            // curr water
            int width = rp - lp ;
            int htght = Math.min(height.get(lp), height.get(rp)) ;
            int currWater = htght * width ;
            maxWater = Math.max(currWater, maxWater);


            //
            if(height.get(lp) < height.get(rp))
            lp++ ;

            else
            rp--;
        }

        return maxWater ;
    }
}
