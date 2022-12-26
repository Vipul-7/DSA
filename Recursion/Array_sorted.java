package Recursion;

public class Array_sorted {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(Arr_sorted(arr, 0));
    }

    public static boolean Arr_sorted(int arr[], int n) {

        if (n == arr.length - 1) {
            return true;
        }

        if (arr[n] > arr[n + 1]) {
            return false;
        }

        return Arr_sorted(arr, n + 1);

    }

}