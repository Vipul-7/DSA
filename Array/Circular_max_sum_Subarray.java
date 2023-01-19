// 918 --> Leetcode

public class Circular_max_sum_Subarray {
    public static void main(String[] args) {
        System.out.println(maxSum_Circular_Subarray(new int[]{8,-8,9,-9,10,-11,12}));
    }

    // Without circluar that can be solve using kadane's algorithm but for circular sum there need some modification
    public static int maxSum_Circular_Subarray(int a[]) {
        int n = a.length ;
        int arrSum = 0;

        int max_sum = Integer.MIN_VALUE;
        int temp_max = 0;

        int min_sum = Integer.MAX_VALUE;
        int temp_min = 0;

        for (int i = 0; i < n; i++) {
            temp_max += a[i];
            max_sum = Math.max(max_sum, temp_max);
            if(temp_max < 0 ) temp_max = 0;

            arrSum += a[i];

            temp_min += a[i];
            min_sum = Math.min(min_sum,temp_min);
            if(temp_min > 0 ) temp_min = 0;
        }

        return arrSum == min_sum ? max_sum : Math.max(arrSum-min_sum, max_sum);
    }
}
