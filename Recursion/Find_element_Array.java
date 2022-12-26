package Recursion;

public class Find_element_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,3,7};
        // System.out.println(fea(arr, 7 , 0));
        // System.out.println(loa(arr, 3, arr.length-1));
        System.out.println(sloa(arr, 3, 0));
    }

    // first occurence in array
    // time complexity and space complexity is o(n)
    public static int fea(int arr[] , int n , int i){
        
        if(arr[i] == n){
            return i;
        }
        if(i == arr.length){
            System.out.println("Not found !");
            return -1 ;
        }
        return fea(arr, n, i+1);
    }

    //last occurence in array (my approach)
    public static int loa(int arr[] , int n , int i) {
        if(i < 0){
            System.out.println("Not found");
            return -1;
        }

        if(arr[i]==n){
            return i ;
        }

        return loa(arr, n, i-1);
    }

    // last occurence(other approach)
    public static int sloa(int arr[] , int n , int i) {
        if(i == arr.length){
            return -1;
        }
        int isFound = sloa(arr,n,i+1);
          
        if(isFound == -1 && arr[i]==n){
            return i ;
        }
        return isFound;
    }
}
