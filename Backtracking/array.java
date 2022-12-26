package Backtracking;

public class array {
    public static void Change_value(int arr[],int i,int val) {
        if(i == arr.length){
            Print_array(arr);
            return ;
        }
        arr[i] = val ;
        Change_value(arr, i+1, val+1);
        arr[i] = arr[i] - 2 ;
    }

    public static void Print_array(int arr[]) {
        for(int i=0; i < arr.length ; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        Change_value(arr, 0, 1);
        Print_array(arr);
    }
}
