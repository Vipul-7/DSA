package Divide_and_Conquer;

public class Search_in_Rotated_array {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2} ;
        System.out.println(sira(arr, 0, 0, arr.length-1));
    }

    public static int sira(int arr[],int target , int si ,int ei) {
        if(si > ei){
            return -1 ;
        }

        int mid = si+(ei-si)/2 ;

        // case-1 (mid on line-1)
        if(arr[si] <= mid){
            // case-a (Line-1 left) 
            if(arr[si] <= target && target <= arr[mid])
            return sira(arr, target, si, mid-1) ;

            // case-b (mid right)
            else
            return sira(arr, target, mid+1, ei);
        }

        // case-2 (mid on line-2)
        else{
            // case-c (line -2 right)
            if(mid <= target && target <= ei)
            return sira(arr, target, mid+1, ei);

            // case d ( mid left)
            else
            return sira(arr, target, si, mid-1);
        }
        
    }
}
