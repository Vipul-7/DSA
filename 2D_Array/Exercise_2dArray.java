public class Exercise_2dArray {
    public static void main(String[] args) {
       int arr[][] = {{1,2,7},{5,8,7},{9,5,7}};
       System.out.println(Seven_In_array(arr)+" Times"); 
        System.out.println("Sum of second row is "+Second_row_sum(arr));
        Transpose();
    }

    // find how many Seven in array
    public static int Seven_In_array(int arr[][]) {
        
        int nu = 7 ;
        int count=0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j = 0; j < arr[0].length ; j++){
                if(arr[i][j] == nu){
                count++;
                continue;
                }

            }
        }
        return count ;
    }

    // second row sum 
    public static int Second_row_sum(int arr[][]) {
        int sum = 0;
        for(int j=0; j < arr[1].length; j++){
            sum += arr[1][j] ;
        }
        return sum ;
    }

    // Transpose the matrix
    public static void Transpose() {
        int ar[][] = {{1,2,3},{4,5,6}} ;
        for(int j = 0 ; j < ar[0].length ; j++){
            for(int i = 0 ; i < ar.length ; i++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
