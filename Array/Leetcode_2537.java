import java.util.HashMap;

// count the number of good subarrays 
// Good subarrays with atleast has pair k

public class Leetcode_2537 {
    public static void main(String[] args) {
        System.out.println(Good_Subarrays(new int[]{3,1,4,3,2,2,4},2));
    }

    public static int Good_Subarrays(int nums[],int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans= 0; 

        for (int i = 0, slow = 0; i < nums.length; i++) {
            hm.putIfAbsent(nums[i], 0);
            k -= hm.get(nums[i]);
            hm.put(nums[i], hm.get(nums[i])+1);

            while (k <= 0) { // agar k negative he to 
                hm.put(nums[slow], hm.get(nums[slow])-1);
                k += hm.get(nums[slow]);
                slow++;
            }
            ans += slow ;
        }

        return ans;
    }
}