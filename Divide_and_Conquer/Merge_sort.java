package Divide_and_Conquer;

public class Merge_sort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8} ;
        merge_sort(arr,0,arr.length-1);
        print_arr(arr);
    }

    public static void print_arr(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void merge_sort(int arr[],int si ,int ei) {
        if(si >= ei){
            return ;
        }
        int mid = si+(ei-si)/2 ;
        merge_sort(arr, si, mid);
        merge_sort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[] = new int[ei-si+1]; // create temp array ei-si+1 size

        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
            temp[k] = arr[i] ;
            i++;
            }

            else{
            temp[k] = arr[j];
            j++;
            }

            k++ ;
        }

        while (i <= mid) { // if mid ke bad vala khatam ho gaya
            temp[k++] = arr[i++] ;
        }

        while (j <= ei) {
            temp[k++] = arr[j++] ;  // if mid ke pehle vala khatam ho gaya
        }

        // copy temp array into main array
        for(k = 0, i = si ; k <temp.length ; k++ , i++){
            arr[i] = temp[k] ;
        }
    }
}
