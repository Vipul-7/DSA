// que-22 ----> Find trapped water on the bars

public class $22_Traped_water {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water is - "+tw(height));
    }

    public static int tw(int height[]) {

        // left boundary  
        int left_max_boundary[] = new int[height.length];
        left_max_boundary[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left_max_boundary[i] = Math.max(height[i], left_max_boundary[i - 1]);
        }

        int right_max_boundary[] = new int[height.length];
        right_max_boundary[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right_max_boundary[i] = Math.max(height[i], right_max_boundary[i + 1]);
        }

        int trapped_water = 0 ;
        for(int i=0 ; i<height.length; i++){
            int water_level = Math.min(left_max_boundary[i],right_max_boundary[i]);
            trapped_water += water_level - height[i] ;
        }
        return trapped_water ;
    }
}
