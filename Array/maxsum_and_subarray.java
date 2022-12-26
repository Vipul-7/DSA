import java.util.*;;

public class maxsum_and_subarray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        // Subarray_and_maxsum_brute(arr);
        maxsum_prefix(arr);
    }

    // subarray of main array , thier sum and maximum sum of one round
    // ( Brute technique but time complexity is pow(n,3))
    public static void Subarray_and_maxsum_brute(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { //

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print(" | Sum is : " + sum);
                if (max_sum < sum)
                    max_sum = sum;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Max sum of this round is:" + max_sum);

    }



    // Prefix technique for finding the maximum sum

    public static void maxsum_prefix(int arr[]) {
        int prefix[] = new int[arr.length];
        int max_sum = Integer.MIN_VALUE;
        
        
        prefix[0] = arr[0];

        // this loop for finding the prefix array
        // prefix array means sum this current element and previous all elements sum
        for(int i=1 ; i<prefix.length ; i++){
          prefix[i] = prefix[i-1] + arr[i] ; 
        }

        for (int i = 0; i < arr.length; i++) { //

            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(max_sum < sum)
                max_sum = sum ;
            }
            
        }
        System.out.println("Max sum of this round is:" + max_sum);
    }
}
