public class Diagonal_sum {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        time_com_n2(arr);
        time_com_n(arr);
    }

    // not optimized
    public static void time_com_n2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) /// if i == j then calculate sum
                    sum += arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i + j == arr.length - 1) // if vlaue's total sum is length-1

                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    // In optimized case we have only loop 
    // j =arr.length-1-i
    public static void time_com_n(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];

            if (i != arr.length - 1 - i) {  // if i =!j then go into this because in sum centere number count 2 tumes ...
                sum += arr[i][arr.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

}
