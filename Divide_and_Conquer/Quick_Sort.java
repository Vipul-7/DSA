package Divide_and_Conquer;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8} ;
        quick(arr, 0, arr.length-1);
        Print_array(arr);
    }

    public static void Print_array(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quick(int arr[] ,int si ,int ei) {
        if(si >= ei){
            return ;
        }

        int pi = partition(arr,si,ei); // partiotion index
        quick(arr, si, pi-1);
        quick(arr, pi+1, ei);
    }

    public static int partition(int arr[],int si,int ei) {
        int pivot = arr[ei] ;
        int i = si-1 ; // make space for element that smaller than pivot

        for(int j=si ; j < ei ; j++){
            if(arr[j] <= pivot){
                i++ ;
                int temp = arr[j] ;
                arr [j] = arr[i] ;
                arr[i] = temp ;
            }
        }
        i++ ;
        int temp = pivot ;
        arr [ei] = arr[i] ;
        arr[i] = temp ;

        return i;
    }
}
