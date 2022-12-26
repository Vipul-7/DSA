import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        System.out.println("Largest value is " + Largest(arr));
        System.out.println("Smallest vale is " + Smallest(arr));
        Linear_search(arr);
        System.out.println("Index is : " + Binary_search(arr));

        Reverse_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        pair_of_array(arr);

    }

    // find largest in the given array
    public static int Largest(int arr[]) {
        int j = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= j) {
                j = arr[i];
            } else
                continue;
        }
        return j;
    }

    // find smallest in the array
    public static int Smallest(int arr[]) {
        int j = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < j)
                j = arr[i];
            else
                continue;
        }
        return j;
    }

    // linear search
    public static int Linear_search(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you wanna find - ");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                int count = i;
                System.out.print(count + " ");
            }

        }
        return -1;
    }

    // Binary search
    public static int Binary_search(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to find :");
        int n = sc.nextInt();
        int start = 0, end = arr.length - 1; // first array index is 0 to length-1

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == n)
                return mid;
            else if (arr[mid] < n)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    // Reverse the array
    public static void Reverse_array(int arr[]) {
        int fei = 0;
        int lei = arr.length - 1;
        while (fei < lei) {
            int temp = arr[lei];
            arr[lei] = arr[fei];
            arr[fei] = temp;
            fei++;
            lei--;
        }

    }

    // pairs in array
    public static void pair_of_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") , ");
            }
            System.out.println();
        }
    }

}
