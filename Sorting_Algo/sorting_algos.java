
public class sorting_algos {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println(arr.length);
        Bubble_sort(arr);
        // System.out.println();
        // Selection_sort(arr);
        // System.out.println();
        // Insertion_sort(arr);
        // System.out.println();
        // Counting_sort(arr);

    }

    // Bubble sort
    public static void Bubble_sort(int arr[]) {
        // boolean swap;
        for (int i = 0 ; i < arr.length-1 ; i++) { // 
            // swap = false ;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // swap = true ;
                }
                // if(swap == false)
                // break;

            }

        }
        print_array(arr);
    }

    // Selection sort
    public static void Selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            // find minimum for compare with all array members
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        print_array(arr);
    }

    // Insertion sort
    public static void Insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int pre = i - 1; // previous index
            while (pre >= 0 && arr[pre] > cur) { // jab tak previous 0 or greater && pre index i index se jyada
                arr[pre + 1] = arr[pre];
                pre--; // previous ka bhi previous ki bari
            }
            arr[pre + 1] = cur; // ab jake apni cur value rakho ( insert karo)
        }
        print_array(arr);
    }

    // Counting sort
    public static void Counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]); // find the max value among given array
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // arr's value is index of count
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        print_array(arr);
    }

    public static void print_array(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
